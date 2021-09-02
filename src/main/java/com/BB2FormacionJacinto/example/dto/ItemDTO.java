package com.BB2FormacionJacinto.example.dto;

import com.BB2FormacionJacinto.example.models.PriceReduction;
import com.BB2FormacionJacinto.example.models.Supplier;
import com.BB2FormacionJacinto.example.enums.StateEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    private List<SupplierDTO> suppliers;
    private List<PriceReductionDTO> priceReductions;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate creation;
    private String creator;
}
