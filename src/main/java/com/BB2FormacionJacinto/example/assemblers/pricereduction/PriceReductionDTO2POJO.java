package com.BB2FormacionJacinto.example.assemblers.pricereduction;

import com.BB2FormacionJacinto.example.dto.PriceReductionDTO;
import com.BB2FormacionJacinto.example.models.PriceReduction;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class PriceReductionDTO2POJO implements Converter<PriceReductionDTO, PriceReduction> {
    @Override
    public PriceReduction convert(PriceReductionDTO priceReductionDTO) {
        ModelMapper mapper = new ModelMapper();
        PriceReduction priceReduction = new PriceReduction();
        mapper.map(priceReductionDTO,priceReduction);
        return priceReduction;

    }
}
