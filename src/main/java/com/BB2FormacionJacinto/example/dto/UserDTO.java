package com.BB2FormacionJacinto.example.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long id_user;
    private String username;
    private String password;
    private boolean admin;
    private boolean enabled;
}
