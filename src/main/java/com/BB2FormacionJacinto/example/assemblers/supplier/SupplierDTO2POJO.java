package com.BB2FormacionJacinto.example.assemblers.supplier;

import com.BB2FormacionJacinto.example.dto.SupplierDTO;
import com.BB2FormacionJacinto.example.models.Supplier;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class SupplierDTO2POJO implements Converter<SupplierDTO, Supplier> {

    @Override
    public Supplier convert(SupplierDTO supplierDTO) {
        ModelMapper mapper = new ModelMapper();
        Supplier supplier = new Supplier();
        mapper.map(supplierDTO,supplier);

        return supplier;
    }
}
