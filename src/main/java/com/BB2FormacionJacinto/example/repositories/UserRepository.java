package com.BB2FormacionJacinto.example.repositories;


import com.BB2FormacionJacinto.example.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser,Long>, CrudRepository<AppUser,Long> {

    AppUser findByUsername(String username);
}
