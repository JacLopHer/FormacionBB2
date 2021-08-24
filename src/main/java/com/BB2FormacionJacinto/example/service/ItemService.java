package com.BB2FormacionJacinto.example.service;

import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.model.Item;

import java.util.List;

public interface ItemService {
    public List<ItemDTO> findItems();
    public ItemDTO findItemById(Long id_item);
    public void createItem(ItemDTO newItem);
    public void updateItem(ItemDTO updatedItem) throws Exception;
    public void deactivateItem(ItemDTO deactivatedItem) throws Exception;
}
