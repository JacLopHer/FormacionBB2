package com.BB2FormacionJacinto.example.repositories;

import com.BB2FormacionJacinto.example.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long>, CrudRepository<Item,Long> {
}
