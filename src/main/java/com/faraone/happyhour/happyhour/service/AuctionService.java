package com.faraone.happyhour.happyhour.service;

import com.faraone.happyhour.happyhour.dto.AuctionRequestDTO;
import com.faraone.happyhour.happyhour.dto.AuctionResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface AuctionService{

    AuctionResponseDTO newAuction(AuctionRequestDTO auctionRequestDTO);

    AuctionResponseDTO getAuctionById(AuctionRequestDTO auctionRequestDTO);
}
