package com.sda.parkingTicket.service;

import com.sda.parkingTicket.model.User;
import com.sda.parkingTicket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getById(Long id){
        Optional<User>user= userRepository.findById(id);
        return user.orElse(null);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public List<User>getAllByUserName(String userName){
        return userRepository.findAllByUserName(userName);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
