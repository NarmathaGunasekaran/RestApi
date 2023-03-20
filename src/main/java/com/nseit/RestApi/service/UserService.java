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

    public void add(UserModel userModel) {
         userRepository.save(userModel);
    }

    public List<UserModel> view() {
        return userRepository.findAll();
    }

    public void update(UserModel userModel) {
        userRepository.save(userModel);
    }

    public void delete(int id) {
        for (UserModel userModel : userRepository.findAll()) {
            if (id == userModel.getUserId())
                userRepository.delete(userModel);
        }


//    public UserModel add(UserModel userModel) {
//
//        return userRepository.save(userModel);
//    }
//
//    public List<UserModel> getAllUser() {
//        List<UserModel> userModels = userRepository.findAll();
//        List<UserModel> userModelList = new ArrayList<>();
//        for (UserModel userModel : userModels){
//            userModel.setUserId(userModel.getUserId());
//            userModel.setDOB(userModel.getDOB());
//            userModel.setName(userModel.getName());
//            userModel.setEmail(userModel.getEmail());
//            userModel.setEducation(userModel.getEducation());
//            userModel.setUserRoleId(userModel.getUserRoleId());
//            userModel.setPhoneNumber(userModel.getPhoneNumber());
//            userModel.setMaritalStatus(userModel.getMaritalStatus());
//
//            userModelList.add(userModel);
//        }
//        return userModels;
//    }
//
//    public UserModel getUser(Integer userId) {
//        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Unable to find user with id" + userId));
//    }
//
//    public UserModel updateUser(UserModel userModel) {
//        if (userModel.getUserId() == null)
//            throw new ResourceNotFoundException("No post with the id " + userModel.getUserId());
//        return userRepository.save(userModel);
//    }
//
//
//    public void delete(Integer id) {
//        userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No User" + id));
//        userRepository.deleteById(id);
//    }
    }
}
