package com.BB2FormacionJacinto.repositories;

import com.BB2FormacionJacinto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PriceReductionRepository extends JpaRepository<User,Long>, CrudRepository<User,Long> {
}
