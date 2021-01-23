package com.faraone.happyhour.happyhour.service.interfaces;

import com.faraone.happyhour.happyhour.model.User;
import org.springframework.security.authentication.BadCredentialsException;


public interface UserAuthenticationService {


    String login(String username, String password) throws BadCredentialsException;

    User authenticateByToken(String token);

    void logout(String username);

}
