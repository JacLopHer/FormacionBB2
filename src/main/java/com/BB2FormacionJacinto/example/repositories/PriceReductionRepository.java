package com.BB2FormacionJacinto.example.repositories;

import com.BB2FormacionJacinto.example.model.PriceReduction;
import com.BB2FormacionJacinto.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceReductionRepository extends JpaRepository<PriceReduction,Long>, CrudRepository<PriceReduction,Long> {
}
