package com.faraone.happyhour.happyhour.repository;

import com.faraone.happyhour.happyhour.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bid, Long> {
}
