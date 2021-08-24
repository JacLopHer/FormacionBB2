package com.BB2FormacionJacinto.example.dto;

import com.BB2FormacionJacinto.example.model.PriceReduction;
import com.BB2FormacionJacinto.example.model.Supplier;
import com.BB2FormacionJacinto.example.enums.StateEnum;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ItemDTO {
    private Long id_item;
    private Long code_product;
    private String description;
    private Double price;
    private StateEnum state;
    private List<Supplier> suppliers;
    private List<PriceReduction> priceReductions;
    private LocalDate creation;
    private String creator;
}
