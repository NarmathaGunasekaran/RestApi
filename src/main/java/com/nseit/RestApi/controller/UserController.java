package com.nseit.RestApi.controller;

import com.nseit.RestApi.model.UserModel;
import com.nseit.RestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    @PostMapping
//    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel userRequest){
//        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<UserModel>> getAllUsers(){
//        return ResponseEntity.ok(userService.getAllUsers());
//    }
//
//
////    @GetMapping("/{id}")
////    public ResponseEntity<UserModel> getUser(@PathVariable Integer Id){
////        return ResponseEntity.ok(userService.getUser(Id));
////    }
//
//    @PutMapping
//    public ResponseEntity<UserModel> updateUser(@RequestBody UserModel userModel) {
//        UserModel updatedUser = userService.updateUser(userModel);
//        return new ResponseEntity<>( HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<UserModel> deleteUser(@PathVariable Integer id) {
//        userService.delete(id);
//        return new ResponseEntity<>( HttpStatus.CREATED);
//    }
//

    @PostMapping
    public long add(@RequestBody UserModel userModel) {
        return userService.save(userModel).getId();
    }

    @PutMapping
    void update(@RequestBody UserModel userModel) {
        userService.update(userModel);
    }

    @GetMapping
    List<UserModel> getUsers() {
        return userService.findAll();
    }

    //    @Secured({Role.ROLE_ADMIN})
    @DeleteMapping("/{id}")
    public ResponseEntity<UserModel> deleteUserPost(@PathVariable Integer id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}


