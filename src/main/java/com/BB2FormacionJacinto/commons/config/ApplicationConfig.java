package com.BB2FormacionJacinto.commons.config;

import com.BB2FormacionJacinto.example.service.implementations.ItemServiceImpl;
import com.BB2FormacionJacinto.example.service.implementations.UserServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }


}
