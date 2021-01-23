package com.faraone.happyhour.happyhour.controller;

import com.faraone.happyhour.happyhour.service.interfaces.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@RestController
public class PublicEndpointsController {
    @Autowired
    private UserAuthenticationService authenticationService;

    @PostMapping("/login")
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password) {
        try {
            return authenticationService
                    .login(username, password);
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(UNAUTHORIZED).body(e.getMessage());
        }
    }

}