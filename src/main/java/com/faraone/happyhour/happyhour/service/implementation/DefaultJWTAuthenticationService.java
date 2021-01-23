package com.faraone.happyhour.happyhour.service.implementation;

import com.faraone.happyhour.happyhour.model.User;
import com.faraone.happyhour.happyhour.service.interfaces.UserAuthenticationService;
import com.faraone.happyhour.happyhour.service.interfaces.UserService;
import com.faraone.happyhour.happyhour.service.security.JWTService;
import com.faraone.happyhour.happyhour.service.security.TokenVerificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Objects;
import java.util.Optional;

public class DefaultJWTAuthenticationService implements UserAuthenticationService {

    @Autowired
    JWTService jwtService;

    @Autowired
    UserService userService;

    @Override
    public String login(String username, String password) throws BadCredentialsException {
        return userService
                .getByUsername(username)
                .filter(user -> Objects.equals(password, user.getPassword()))
                .map(user -> jwtService.create(username))
                .orElseThrow(() -> new BadCredentialsException("Invalid username or password."));
    }

    @Override
    public User authenticateByToken(String token) {
        try {
            Object username = jwtService.verify(token).get("username");
            return Optional.ofNullable(username)
                    .flatMap(name -> userService.getByUsername(String.valueOf(name)))
                    .orElseThrow(() -> new UsernameNotFoundException("User '" + username + "' not found."));
        } catch (TokenVerificationException e) {
            throw new BadCredentialsException("Invalid JWT token.", e);
        }
    }

    @Override
    public void logout(String username) {
        //
    }

}
