package com.faraone.happyhour.happyhour.controller;

import com.faraone.happyhour.happyhour.dto.AuctionRequestDTO;
import com.faraone.happyhour.happyhour.dto.AuctionResponseDTO;
import com.faraone.happyhour.happyhour.service.interfaces.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auction")
public class AuctionController {

    @Autowired
    AuctionService auctionService;

    @PostMapping("/new")
    public AuctionResponseDTO newAuction(@RequestBody AuctionRequestDTO auctionRequestDTO) {
        return auctionService.newAuction(auctionRequestDTO);
    }

    @GetMapping("/{id}")
    public AuctionResponseDTO getAuctionById(@PathVariable("id") AuctionRequestDTO auctionRequestDTO) {
        return auctionService.getAuctionById(auctionRequestDTO);
    }
}
