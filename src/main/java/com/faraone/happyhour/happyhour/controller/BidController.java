package com.faraone.happyhour.happyhour.controller;

import com.faraone.happyhour.happyhour.dto.BidRequestDTO;
import com.faraone.happyhour.happyhour.dto.BidResponseDTO;
import com.faraone.happyhour.happyhour.service.interfaces.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bid")
public class BidController {

    @Autowired
    BidService bidService;

    @PostMapping("place")
    public BidResponseDTO placeBid(BidRequestDTO bidRequestDTO) {
        return bidService.placeBid(bidService);
    }
}
