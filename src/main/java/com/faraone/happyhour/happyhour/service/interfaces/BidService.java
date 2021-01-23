package com.faraone.happyhour.happyhour.service.interfaces;

import com.faraone.happyhour.happyhour.dto.BidResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface BidService {
    BidResponseDTO placeBid(BidService bidService);
}
