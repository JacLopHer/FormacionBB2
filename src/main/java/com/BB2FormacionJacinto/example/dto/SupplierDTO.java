package com.BB2FormacionJacinto.example.dto;

import com.BB2FormacionJacinto.example.model.Item;
import lombok.Data;
import java.util.List;

@Data
public class SupplierDTO {
    Long id_supplier;
    private String name;
    private String country;
    private List<Item> items;
}
