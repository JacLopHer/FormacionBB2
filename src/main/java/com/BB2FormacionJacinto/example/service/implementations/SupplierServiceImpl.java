package com.BB2FormacionJacinto.example.service.implementations;

import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.dto.SupplierDTO;
import com.BB2FormacionJacinto.example.models.Supplier;
import com.BB2FormacionJacinto.example.repositories.SupplierRepository;
import com.BB2FormacionJacinto.example.service.SupplierService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<SupplierDTO> findAllSuppliers() {

        return supplierRepository.findAll()
                .stream()
                .map(supplier->mapper.map(supplier, SupplierDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public SupplierDTO addSupplier(SupplierDTO supplierDTO) {
        Supplier supplier = new Supplier();
        supplier.setName(supplierDTO.getName());
        supplier.setCountry(supplierDTO.getCountry());
        supplierRepository.save(supplier);

        return mapper.map(supplier,SupplierDTO.class);
    }
}
