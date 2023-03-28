package com.nseit.RestApi.service;


import com.nseit.RestApi.model.RoleModel;
import com.nseit.RestApi.model.UserModel;
import com.nseit.RestApi.repository.RoleRepository;
import com.nseit.RestApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public UserModel save(UserModel userModel) {
        userRepository.save(userModel);
        return userModel;
    }

    public UserModel addRoleToUser(int role_id, int user_id ) {
        RoleModel roleModel = roleRepository.findById(role_id).get();
        UserModel userModel = userRepository.findById(user_id).get();
        RoleModel.setEnrolledUser(roleModel);
        return userRepository.save(userModel);
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

