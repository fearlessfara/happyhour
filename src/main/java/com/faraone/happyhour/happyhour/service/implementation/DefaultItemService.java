package com.faraone.happyhour.happyhour.service.implementation;

import com.faraone.happyhour.happyhour.dto.ItemListRequestDTO;
import com.faraone.happyhour.happyhour.dto.ItemListResponseDTO;
import com.faraone.happyhour.happyhour.dto.ItemRequestDTO;
import com.faraone.happyhour.happyhour.service.interfaces.ItemService;
import org.springframework.stereotype.Service;

@Service
public class DefaultItemService implements ItemService {
    @Override
    public ItemRequestDTO saveItem(ItemRequestDTO itemRequestDTO) {
        return null;
    }

    @Override
    public ItemRequestDTO getItem(Long id) {
        return null;
    }

    @Override
    public ItemListResponseDTO getItems() {
        return null;
    }

    @Override
    public ItemListResponseDTO getItems(ItemListRequestDTO itemListRequestDTO) {
        return null;
    }
}
