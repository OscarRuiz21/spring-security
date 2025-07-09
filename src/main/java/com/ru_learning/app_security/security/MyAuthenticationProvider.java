package com.ru_learning.app_security.security;

import com.ru_learning.app_security.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class MyAuthenticationProvider implements AuthenticationProvider {

    private CustomerRepository customerRepository;
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final var username = authentication.getName();
        final var password = authentication.getCredentials().toString();
        //final var passwordAsHash = passwordEncoder.encode(password);
        final var customerFromDB = this.customerRepository.findByEmail(username);

        final var customer = customerFromDB.orElseThrow(() -> new BadCredentialsException("Invalid credentials") {});

        final var customerPassword = customer.getPassword();

        if (passwordEncoder.matches(password, customerPassword)) {
            final var roles = customer.getRoles();
            final var authorities = roles.stream()
                    .map(role -> new SimpleGrantedAuthority(role.getName()))
                    .collect(Collectors.toList());
            return new UsernamePasswordAuthenticationToken(username, password, authorities);
        } else{
            throw new BadCredentialsException("Invalid credentials");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
