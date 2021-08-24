package com.BB2FormacionJacinto.commons.config;

import com.BB2FormacionJacinto.example.assemblers.item.ItemDTO2POJO;
import com.BB2FormacionJacinto.example.assemblers.item.ItemPOJO2DTO;
import com.BB2FormacionJacinto.example.assemblers.pricereduction.PriceReductionDTO2POJO;
import com.BB2FormacionJacinto.example.assemblers.pricereduction.PriceReductionPOJO2DTO;
import com.BB2FormacionJacinto.example.assemblers.supplier.SupplierDTO2POJO;
import com.BB2FormacionJacinto.example.assemblers.supplier.SupplierPOJO2DTO;
import com.BB2FormacionJacinto.example.assemblers.user.UserDTO2POJO;
import com.BB2FormacionJacinto.example.assemblers.user.UserPOJO2DTO;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableWebSecurity
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper ();
        return mapper;
    }



  /*  protected void configure(HttpSecurity http) throws Exception {
        http.cors().configurationSource(request -> new org.springframework.web.cors.CorsConfiguration().applyPermitDefaultValues());
    }*/
}
