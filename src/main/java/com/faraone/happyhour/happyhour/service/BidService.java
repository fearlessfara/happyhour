package com.faraone.happyhour.happyhour.service;

import com.faraone.happyhour.happyhour.dto.BidResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface BidService {
    BidResponseDTO placeBid(BidService bidService);
}
