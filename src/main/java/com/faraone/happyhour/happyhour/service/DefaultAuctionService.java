package com.faraone.happyhour.happyhour.service;


import com.faraone.happyhour.happyhour.dto.AuctionRequestDTO;
import com.faraone.happyhour.happyhour.dto.AuctionResponseDTO;
import com.faraone.happyhour.happyhour.helper.AuctionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultAuctionService implements AuctionService {
    @Autowired
    AuctionHelper auctionHelper;


    @Override
    public AuctionResponseDTO newAuction(AuctionRequestDTO auctionRequestDTO) {
        auctionHelper.newAuction(auctionRequestDTO);
        return new AuctionResponseDTO();
    }

    @Override
    public AuctionResponseDTO getAuctionById(AuctionRequestDTO auctionRequestDTO) {

        return null;
    }
}
