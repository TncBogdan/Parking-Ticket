package com.sda.parkingTicket.service;

import com.sda.parkingTicket.model.Role;
import com.sda.parkingTicket.model.User;
import com.sda.parkingTicket.repository.RoleRepository;
import com.sda.parkingTicket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl extends UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
        return user;
    }

    public User findByUsername(String username) {
        return (User) userRepository.findByUsername(username);
    }
}

