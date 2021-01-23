package com.faraone.happyhour.happyhour.repository;

import com.faraone.happyhour.happyhour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
