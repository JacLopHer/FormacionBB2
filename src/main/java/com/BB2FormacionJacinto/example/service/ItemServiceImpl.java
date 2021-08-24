package com.BB2FormacionJacinto.example.service;

import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.model.Item;
import com.BB2FormacionJacinto.example.repositories.ItemRepository;
import com.BB2FormacionJacinto.example.repositories.PriceReductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PriceReductionRepository priceReductionRepository;

    @Autowired
    private ConversionService conversionService;

    public List<ItemDTO> findItems(){
        return itemRepository.findAll()
                             .stream()
                             .map(item->conversionService
                             .convert(item,ItemDTO.class))
                             .collect(Collectors.toList());
    }

    public ItemDTO findItemById(Long id_item){
        Optional<Item> item = itemRepository.findById(id_item);
        return (item.isPresent())? conversionService.convert(item.get(), ItemDTO.class) : null;
    }

    public void createItem(ItemDTO newItem){
        Item item;
    }
    public void updateItem(ItemDTO updatedItem) throws Exception{

    }
    public void deactivateItem(ItemDTO deactivatedItem) throws Exception{

    }
}
