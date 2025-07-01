package com.ru_learning.app_security.security;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/* TO IMPLEMENT OUR OWN PASSWORD ENCODER
@Component
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        return String.valueOf(rawPassword.toString().hashCode());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        var passwordAsString = String.valueOf(rawPassword.toString().hashCode());
        System.out.println(passwordAsString);
        return encodedPassword.equals(passwordAsString);
    }
}
*/

public class MyPasswordEncoder{}

