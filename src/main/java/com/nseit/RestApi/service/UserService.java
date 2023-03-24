package com.nseit.RestApi.service;


import com.nseit.RestApi.model.UserModel;
import com.nseit.RestApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel save(UserModel userModel) {
        userRepository.save(userModel);
        return userModel;
    }

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    public void update(UserModel userModel) {
        userRepository.save(userModel);
    }

    public void deleteUser(Integer id) {
        userRepository.findById(id);
        userRepository.deleteById(id);
    }

}

