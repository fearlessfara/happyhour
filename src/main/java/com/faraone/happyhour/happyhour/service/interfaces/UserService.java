package com.faraone.happyhour.happyhour.service.interfaces;

import com.faraone.happyhour.happyhour.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    Optional<User> getByToken(String token);

    Optional<User> getByUsername(String username);

    void save(User u);
}
