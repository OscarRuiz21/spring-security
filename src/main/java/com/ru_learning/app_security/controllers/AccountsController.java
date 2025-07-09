package com.ru_learning.app_security.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/accounts")
public class AccountsController {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public Map<String, String> accounts() {
        //... business logic
        return Collections.singletonMap("msj", "accounts");
    }
}
