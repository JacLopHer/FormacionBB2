package com.BB2FormacionJacinto.example.assemblers.user;

import com.BB2FormacionJacinto.example.dto.UserDTO;
import com.BB2FormacionJacinto.example.models.AppUser;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class UserDTO2POJO implements Converter<UserDTO, AppUser> {
    @Override
    public AppUser convert(UserDTO userDTO) {
        ModelMapper mapper = new ModelMapper();
        AppUser appUser = new AppUser();
        mapper.map(userDTO, appUser);
        return appUser;
    }
}
