package com.BB2FormacionJacinto.example.service.implementations;

import com.BB2FormacionJacinto.example.dto.UserDTO;
import com.BB2FormacionJacinto.example.models.User;
import com.BB2FormacionJacinto.example.repositories.UserRepository;
import com.BB2FormacionJacinto.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDTO newUser(UserDTO userDTO) {
        User user = mapper.map(userDTO,User.class);
        userRepository.save(user);

        return mapper.map(user,UserDTO.class);

    }

    @Override
    public UserDTO deleteUser(UserDTO userDTO) {
        User user = mapper.map(userDTO,User.class);
        userRepository.delete(user);

        return mapper.map(user,UserDTO.class);
    }

    @Override
    public List<UserDTO> listUsers() {
        List<User> users = userRepository.findAll();
        List<UserDTO> usersDTO = new ArrayList<>();

        for(User user : users){
            if(user != null){
                usersDTO.add(mapper.map(user,UserDTO.class));
            }
        }

        return (users.isEmpty()) ? null : usersDTO;
    }
}
