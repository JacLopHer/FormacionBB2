package com.BB2FormacionJacinto.example.service.implementations;

import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.dto.PriceReductionDTO;
import com.BB2FormacionJacinto.example.enums.StateEnum;
import com.BB2FormacionJacinto.example.models.Item;
import com.BB2FormacionJacinto.example.models.PriceReduction;
import com.BB2FormacionJacinto.example.repositories.ItemRepository;
import com.BB2FormacionJacinto.example.repositories.PriceReductionRepository;
import com.BB2FormacionJacinto.example.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PriceReductionRepository priceReductionRepository;


    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ItemDTO> getItemsList() {
        return itemRepository.findAll()
                            .stream()
                            .map(item->mapper.map(item,ItemDTO.class)).collect(Collectors.toList());
    }

    @Override
    public ItemDTO findItemById(Long id_item) {
       Optional<Item> optionalItem = itemRepository.findById(id_item);
        return (optionalItem.isPresent())
                                          ? mapper.map(optionalItem.get(),ItemDTO.class)
                                          : null;
    }

    @Override
    @Transactional
    public ItemDTO createItem(ItemDTO newItem) {
        Item itemToPersist = mapper.map(newItem, Item.class);
        itemToPersist.setCreatedDate(new Date());
        itemRepository.save(itemToPersist);
        priceReductionRepository.saveAll(itemToPersist.getPriceReductions());
        return mapper.map(itemToPersist, ItemDTO.class);
    }

    @Override
    @Transactional
    public ItemDTO updateItem(ItemDTO itemDTO) throws Exception {
        Optional<Item> itemOptional = itemRepository.findById(itemDTO.getId_item());
        Item itemToUpdate = null;
        if(itemOptional.isPresent()){
            itemToUpdate = itemOptional.get();
            itemToUpdate.setDescription(itemDTO.getDescription());
            itemToUpdate.setCode_product(itemDTO.getCode_product());
            itemToUpdate.setCreator(itemDTO.getCreator());
            itemToUpdate.setPrice(itemDTO.getPrice());
            itemToUpdate.setModifiedDate(new Date());
          if(itemDTO != null){
              for (PriceReductionDTO priceReductionDTO : itemDTO.getPriceReductions()) {
                  //Si no tiene ID, viene del cliente como objeto nuevo.
                  if(priceReductionDTO.getId_price_reduction() == null) {
                      PriceReduction pricePojo = mapper.map(priceReductionDTO, PriceReduction.class);
                      pricePojo.setItem(itemToUpdate);
                      pricePojo.setStart_date(new Date());
                      pricePojo.setModifiedDate(new Date());
                      itemToUpdate.getPriceReductions().add(pricePojo);
                  }
              }
          }
          itemRepository.saveAndFlush(itemToUpdate);
        }
        return mapper.map(itemToUpdate, ItemDTO.class);
    }

    @Override
    @Transactional
    public ItemDTO deactivateItem(ItemDTO deactivatedItem) throws Exception {
        Item itemToDeactivate = itemRepository.getById(deactivatedItem.getId_item());

        if(itemToDeactivate != null){
            itemToDeactivate.setState(StateEnum.DISCONTINUED);
            itemRepository.save(itemToDeactivate);
        }

        return mapper.map(itemToDeactivate, ItemDTO.class);
    }
}
