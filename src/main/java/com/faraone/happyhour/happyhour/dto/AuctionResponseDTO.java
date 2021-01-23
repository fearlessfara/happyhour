package com.faraone.happyhour.happyhour.dto;

import com.faraone.happyhour.happyhour.model.Auction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuctionResponseDTO {

    public String name;
    public String description;
    public ItemDTO item;
    public LocalDateTime start;
    public LocalDateTime end;

    public static AuctionResponseDTO of(Auction auction) {
        AuctionResponseDTO responseDTO = new AuctionResponseDTO();
        responseDTO.name = auction.getName();
        responseDTO.description = auction.getDescription();
        responseDTO.start = auction.getStart();
        responseDTO.end = auction.getEnd();
        responseDTO.item = ItemDTO.of(auction.getItem());
        return responseDTO;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("description", description)
                .append("start", start)
                .append("end", end)
                .toString();
    }
}
