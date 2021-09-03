package com.BB2FormacionJacinto.example.dto;

import com.BB2FormacionJacinto.example.models.Item;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class PriceReductionDTO {
    private Long id_price_reduction;
    private Double reduced_price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date start_date;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date end_date;
}
