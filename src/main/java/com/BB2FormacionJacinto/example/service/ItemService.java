package com.BB2FormacionJacinto.example.service;

import com.BB2FormacionJacinto.example.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    public List<ItemDTO> getItemsList();
    public ItemDTO findItemById(Long id_item);
    public ItemDTO createItem(ItemDTO newItem);
    public ItemDTO updateItem(ItemDTO updatedItem) throws Exception;
    public ItemDTO deactivateItem(ItemDTO deactivatedItem) throws Exception;
}
