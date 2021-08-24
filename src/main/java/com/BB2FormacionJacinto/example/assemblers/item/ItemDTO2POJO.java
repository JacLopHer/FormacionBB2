package com.BB2FormacionJacinto.example.assemblers.item;

import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.models.Item;

import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class ItemDTO2POJO implements Converter<ItemDTO, Item> {

    @Override
    public Item convert(ItemDTO itemDTO) {

        ModelMapper mapper = new ModelMapper();
        Item item = new Item();
        mapper.map(itemDTO,Item.class);
        return item;
    }
}
