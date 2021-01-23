package com.faraone.happyhour.happyhour.service.implementation;


import com.faraone.happyhour.happyhour.dto.BidResponseDTO;
import com.faraone.happyhour.happyhour.helper.BidHelper;
import com.faraone.happyhour.happyhour.service.interfaces.BidService;
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
