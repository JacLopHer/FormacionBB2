package com.BB2FormacionJacinto.example.controller;


import com.BB2FormacionJacinto.example.dto.ItemDTO;
import com.BB2FormacionJacinto.example.dto.UserDTO;
import com.BB2FormacionJacinto.example.models.User;
import com.BB2FormacionJacinto.example.service.implementations.ItemServiceImpl;
import com.BB2FormacionJacinto.example.service.implementations.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/all")
    public List<UserDTO> findAll(){
        return userService.listUsers();
    }

    @PostMapping("/crud/create")
    public ResponseEntity<UserDTO> newUser(@RequestBody UserDTO userDTO){
        try {
            UserDTO result = userService.newUser(userDTO);
            return new ResponseEntity<UserDTO>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<UserDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crud/delete/{id}")
    public ResponseEntity<UserDTO> deleteUser(@PathVariable Long id){
        try {
            UserDTO result = userService.deleteUserById(id);
            return new ResponseEntity<UserDTO>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<UserDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
