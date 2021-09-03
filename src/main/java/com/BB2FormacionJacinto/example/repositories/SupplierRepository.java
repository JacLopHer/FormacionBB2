package com.BB2FormacionJacinto.example.repositories;

import com.BB2FormacionJacinto.example.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long> , CrudRepository<Supplier,Long> {


}
