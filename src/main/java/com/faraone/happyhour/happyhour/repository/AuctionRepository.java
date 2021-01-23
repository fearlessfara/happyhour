package com.faraone.happyhour.happyhour.repository;

import com.faraone.happyhour.happyhour.model.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction, Long> {
}
