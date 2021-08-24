package com.BB2FormacionJacinto.example.assemblers.user;


import com.BB2FormacionJacinto.example.dto.UserDTO;

import com.BB2FormacionJacinto.example.models.User;
import org.dom4j.rule.Mode;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class UserPOJO2DTO implements Converter<User, UserDTO> {

    @Override
    public UserDTO convert(User user) {
        ModelMapper mapper = new ModelMapper();
        UserDTO userDTO = new UserDTO();
        mapper.map(user,userDTO);

        return userDTO;

    }
}
