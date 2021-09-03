package com.BB2FormacionJacinto.example.service;

import com.BB2FormacionJacinto.example.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    public List<SupplierDTO> findAllSuppliers();
    public SupplierDTO addSupplier(SupplierDTO supplierDTO);
}
