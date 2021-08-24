package com.BB2FormacionJacinto.example.repositories;


import com.BB2FormacionJacinto.example.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>, CrudRepository<User,Long> {
    User findUserByUsername(String name);
}
