package com.faraone.happyhour.happyhour.service;

import com.faraone.happyhour.happyhour.dto.ItemRequestDTO;
import com.faraone.happyhour.happyhour.dto.ItemListResponseDTO;
import com.faraone.happyhour.happyhour.dto.ItemListRequestDTO;

public interface ItemService {

    public ItemRequestDTO saveItem(ItemRequestDTO itemRequestDTO);
    public ItemRequestDTO getItem(Long id);

    public ItemListResponseDTO getItems();
    public ItemListResponseDTO getItems(ItemListRequestDTO itemListRequestDTO);

}
