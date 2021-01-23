package com.faraone.happyhour.happyhour.service;


import com.faraone.happyhour.happyhour.dto.BidResponseDTO;
import com.faraone.happyhour.happyhour.helper.BidHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultBidService implements BidService {

    @Autowired
    BidHelper bidHelper;

    @Override
    public BidResponseDTO placeBid(BidService bidService) {
        return null;
    }
}
