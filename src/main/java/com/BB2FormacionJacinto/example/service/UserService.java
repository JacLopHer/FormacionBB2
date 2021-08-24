package com.BB2FormacionJacinto.example.service;

import com.BB2FormacionJacinto.example.dto.UserDTO;

import java.util.List;

public interface UserService {
    public UserDTO newUser(UserDTO userDTO);
    public UserDTO deleteUser(UserDTO userDTO);
    public List<UserDTO> listUsers();
}
