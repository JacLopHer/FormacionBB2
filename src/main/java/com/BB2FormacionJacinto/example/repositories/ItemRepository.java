package com.BB2FormacionJacinto.example.repositories;

import com.BB2FormacionJacinto.example.model.Item;
import com.BB2FormacionJacinto.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long>, CrudRepository<Item,Long> {
    //FindBy --> la columna gracias al CrudRepository, buscar
}
