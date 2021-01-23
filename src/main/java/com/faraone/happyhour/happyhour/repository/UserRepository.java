package com.faraone.happyhour.happyhour.repository;

import com.faraone.happyhour.happyhour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByToken(String token);

    Optional<User> findByUsername(String username);
}
