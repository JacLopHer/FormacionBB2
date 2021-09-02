package com.BB2FormacionJacinto.example.assemblers.user;


import com.BB2FormacionJacinto.example.dto.UserDTO;

import com.BB2FormacionJacinto.example.models.AppUser;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class UserPOJO2DTO implements Converter<AppUser, UserDTO> {

    @Override
    public UserDTO convert(AppUser appUser) {
        ModelMapper mapper = new ModelMapper();
        UserDTO userDTO = new UserDTO();
        mapper.map(appUser,userDTO);

        return userDTO;

    }
}
