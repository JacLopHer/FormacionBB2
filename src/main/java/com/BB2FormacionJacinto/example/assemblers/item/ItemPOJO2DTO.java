package com.BB2FormacionJacinto.example.assemblers.item;

import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.models.Item;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class ItemPOJO2DTO implements Converter<Item, ItemDTO> {

    @Override
    public ItemDTO convert(Item item) {
        ModelMapper modelMapper = new ModelMapper();
        ItemDTO itemdto = new ItemDTO();
        modelMapper.map(item,itemdto);

        return itemdto;
    }
}
