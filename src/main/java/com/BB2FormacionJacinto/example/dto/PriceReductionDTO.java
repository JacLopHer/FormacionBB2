package com.BB2FormacionJacinto.example.dto;

import com.BB2FormacionJacinto.example.model.Item;
import lombok.Data;
import java.util.Date;

@Data
public class PriceReductionDTO {
    private Long id_price_reduction;
    private Double reduced_price;
    private Date start_date;
    private Date end_date;
    private Item item;
}
