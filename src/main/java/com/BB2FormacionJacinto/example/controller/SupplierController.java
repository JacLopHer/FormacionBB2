package com.BB2FormacionJacinto.example.controller;

import com.BB2FormacionJacinto.example.dto.SupplierDTO;
import com.BB2FormacionJacinto.example.service.implementations.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class SupplierController {

    @Autowired
    private SupplierServiceImpl supplierService;

    @GetMapping("/suppliers")
    public List<SupplierDTO> getAllSupliers(){
        return supplierService.findAllSuppliers();
    }
}
