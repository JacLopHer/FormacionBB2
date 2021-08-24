package com.BB2FormacionJacinto.example.assemblers.user;

import com.BB2FormacionJacinto.example.dto.UserDTO;
import com.BB2FormacionJacinto.example.models.User;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class UserDTO2POJO implements Converter<UserDTO, User> {
    @Override
    public User convert(UserDTO userDTO) {
        ModelMapper mapper = new ModelMapper();
        User user = new User();
        mapper.map(userDTO,user);
        return user;
    }
}
