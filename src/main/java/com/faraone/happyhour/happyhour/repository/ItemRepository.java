package com.faraone.happyhour.happyhour.repository;

import com.faraone.happyhour.happyhour.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
