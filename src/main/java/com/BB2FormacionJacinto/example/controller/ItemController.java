package com.BB2FormacionJacinto.example.controller;

import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.service.implementations.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @GetMapping("/items")
    public List<ItemDTO> getAllItems(){
        return itemService.getItemsList();
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<ItemDTO> getItemById(@PathVariable String id){
        ItemDTO result = itemService.findItemById(Long.parseLong(id));
        return (result != null) ? new ResponseEntity<ItemDTO>(result,HttpStatus.OK)
                                : new ResponseEntity<ItemDTO>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/item/crud/create")
    public ResponseEntity<ItemDTO> storeItem(@RequestBody ItemDTO itemDTO){

        try{
            ItemDTO result = itemService.createItem(itemDTO);
            return new ResponseEntity<ItemDTO>(result,HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<ItemDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/item/crud/update")
    public ResponseEntity<ItemDTO> updateItem(@RequestBody ItemDTO itemDTO) {
        try {
            ItemDTO result = itemService.updateItem(itemDTO);
            return new ResponseEntity<ItemDTO>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<ItemDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/item/crud/discontinue")
    public ResponseEntity<ItemDTO> discontinueItem(@RequestBody ItemDTO itemDTO) {
        try {
            ItemDTO result = itemService.deactivateItem(itemDTO);
            return new ResponseEntity<ItemDTO>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<ItemDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
