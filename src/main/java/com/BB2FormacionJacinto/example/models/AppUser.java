package com.BB2FormacionJacinto.example.models;


import com.BB2FormacionJacinto.commons.models.AuditModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class AppUser extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name ="admin")
    private boolean admin;

    @Column(name = "enabled")
    private boolean enabled;


    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
