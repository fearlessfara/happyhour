package com.faraone.happyhour.happyhour.service.interfaces;

import com.faraone.happyhour.happyhour.dto.ItemListRequestDTO;
import com.faraone.happyhour.happyhour.dto.ItemListResponseDTO;
import com.faraone.happyhour.happyhour.dto.ItemRequestDTO;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    ItemRequestDTO saveItem(ItemRequestDTO itemRequestDTO);

    ItemRequestDTO getItem(Long id);

    ItemListResponseDTO getItems();

    ItemListResponseDTO getItems(ItemListRequestDTO itemListRequestDTO);


}
