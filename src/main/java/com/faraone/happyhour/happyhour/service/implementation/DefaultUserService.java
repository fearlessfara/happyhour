package com.faraone.happyhour.happyhour.service.implementation;

import com.faraone.happyhour.happyhour.model.User;
import com.faraone.happyhour.happyhour.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultUserService implements UserService {
    @Override
    public Optional<User> getByToken(String token) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void save(User u) {

    }
}
