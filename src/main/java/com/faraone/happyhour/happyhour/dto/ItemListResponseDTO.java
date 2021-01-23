package com.faraone.happyhour.happyhour.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemListResponseDTO {
    public List<ItemDTO> itemDTOS;
}
