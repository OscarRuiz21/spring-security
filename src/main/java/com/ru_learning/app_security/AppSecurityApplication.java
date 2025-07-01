package com.ru_learning.app_security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class AppSecurityApplication /*implements CommandLineRunner*/ {

	/*
	private final PasswordEncoder passwordEncoder;

	public AppSecurityApplication(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
	*/

	public static void main(String[] args) {
		SpringApplication.run(AppSecurityApplication.class, args);
	}
	/*
	@Override
	public void run(String... args) throws Exception {
		System.out.println(passwordEncoder.encode("to_be_encoded"));
	}*/
}
