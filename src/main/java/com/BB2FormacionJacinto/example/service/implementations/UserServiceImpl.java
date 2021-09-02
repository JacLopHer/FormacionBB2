package com.BB2FormacionJacinto.example.service.implementations;

import com.BB2FormacionJacinto.example.dto.UserDTO;
import com.BB2FormacionJacinto.example.models.AppUser;
import com.BB2FormacionJacinto.example.repositories.UserRepository;
import com.BB2FormacionJacinto.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDTO newUser(UserDTO userDTO) {
        AppUser appUser = mapper.map(userDTO, AppUser.class);
        userRepository.save(appUser);

        return mapper.map(appUser,UserDTO.class);

    }

    @Override
    public UserDTO deleteUserById(Long id) {
        AppUser appUser = userRepository.getById(id);
        userRepository.delete(appUser);
        return mapper.map(appUser,UserDTO.class);
    }

    @Override
    public List<UserDTO> listUsers() {
        List<AppUser> appUsers = userRepository.findAll();
        List<UserDTO> usersDTO = new ArrayList<>();

        for(AppUser appUser : appUsers){
            if(appUser != null){
                usersDTO.add(mapper.map(appUser,UserDTO.class));
            }
        }

        return (appUsers.isEmpty()) ? null : usersDTO;
    }

    @Override
    public UserDTO findUserById(Long id) {
        AppUser appUser = userRepository.getById(id);
        return mapper.map(appUser,UserDTO.class);
    }

    @Override
    public UserDTO loginUser(String username) {
        AppUser appUser = userRepository.findByUsername(username);
        return mapper.map(appUser,UserDTO.class);
    }


}
