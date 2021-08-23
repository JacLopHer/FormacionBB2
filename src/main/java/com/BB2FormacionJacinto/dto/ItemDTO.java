package com.BB2FormacionJacinto.dto;

import com.BB2FormacionJacinto.entities.PriceReduction;
import com.BB2FormacionJacinto.entities.Supplier;
import com.BB2FormacionJacinto.globalservices.StateEnum;
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
