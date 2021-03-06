package com.faraone.happyhour.happyhour.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuctionRequestDTO {

    public String name;
    public String description;
    public LocalDateTime start;
    public LocalDateTime end;

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
