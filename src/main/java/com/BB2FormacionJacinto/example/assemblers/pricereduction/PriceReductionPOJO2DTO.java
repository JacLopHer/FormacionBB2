package com.BB2FormacionJacinto.example.assemblers.pricereduction;

import com.BB2FormacionJacinto.example.dto.PriceReductionDTO;
import com.BB2FormacionJacinto.example.models.PriceReduction;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class PriceReductionPOJO2DTO implements Converter<PriceReduction, PriceReductionDTO> {
    @Override
    public PriceReductionDTO convert(PriceReduction priceReduction) {
        ModelMapper mapper = new ModelMapper();
        PriceReductionDTO priceReductionDTO = new PriceReductionDTO();
        mapper.map(priceReduction,priceReductionDTO);

        return priceReductionDTO;
    }
}
