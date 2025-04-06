package com.example.PaymentsWebApp.services;

import com.example.PaymentsWebApp.Entity.UserEntity;
import com.example.PaymentsWebApp.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity validateUser(String userName, String password) {
        UserEntity user = userRepository.findByuserName(userName);
        if (user != null && user.getPassword().equals(password)) {
            return user;  // login success
        }
        return null; // login fail
    }
}