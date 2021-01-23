package com.faraone.happyhour.happyhour.dto;

import com.faraone.happyhour.happyhour.model.Item;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDTO {
    public Long id;
    public String name;
    public String description;
    public String size;

    public static ItemDTO of(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.id = item.getId();
        itemDTO.name = item.getName();
        itemDTO.size = item.getSize();
        itemDTO.description = item.getDescription();
        return itemDTO;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("description", description)
                .append("size", size)
                .toString();
    }
}
