package com.sda.parkingTicket.controller;

import com.sda.parkingTicket.model.User;
import com.sda.parkingTicket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        user.setId(null);
        return userService.createUser(user);
    }
    @GetMapping(value = "/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }
    @GetMapping
    public List<User>getAll(@RequestParam (name = "userName", required = false)String userName){
        if (userName!= null){
            return userService.getAllByUserName(userName);
        }else {
            return userService.getAll();
        }
    }
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }

}
