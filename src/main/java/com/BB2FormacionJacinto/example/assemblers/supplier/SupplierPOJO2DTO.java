package com.BB2FormacionJacinto.example.assemblers.supplier;

import com.BB2FormacionJacinto.example.dto.SupplierDTO;
import com.BB2FormacionJacinto.example.models.Supplier;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;


public class SupplierPOJO2DTO implements Converter<Supplier, SupplierDTO> {
    @Override
    public SupplierDTO convert(Supplier supplier) {
        ModelMapper mapper = new ModelMapper();
        SupplierDTO supplierDTO = new SupplierDTO();
        mapper.map(supplier,supplierDTO);

        return supplierDTO;
    }
}
