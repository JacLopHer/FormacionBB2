package com.BB2FormacionJacinto.repositories;

import com.BB2FormacionJacinto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<User,Long>, CrudRepository<User,Long> {

}
