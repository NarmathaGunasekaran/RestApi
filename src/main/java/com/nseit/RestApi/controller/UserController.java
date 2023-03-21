package com.nseit.RestApi.controller;

import com.nseit.RestApi.model.UserModel;
import com.nseit.RestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void add(UserModel userModel) {
        userService.add(userModel);
    }


    @GetMapping
    public void view() {
        userService.view();

    }

    @PutMapping
    public void update(UserModel userModel) {
        userService.update(userModel);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);


//    @PostMapping
//    public ResponseEntity<APIResponse> add(@RequestBody UserModel userModel) {
//        UserModel adduser = userService.add(userModel);
//        apiResponse.setStatus(HttpStatus.CREATED.value());
//        apiResponse.setData(adduser);
//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<APIResponse> getAllUser() {
//        List<UserModel> viewAllUser = userService.getAllUser();
//        apiResponse.setStatus(HttpStatus.CREATED.value());
//        apiResponse.setData(viewAllUser);
//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<APIResponse> getUser(@PathVariable Integer id){
//        UserModel viewUser = userService.getUser(id);
//        apiResponse.setStatus(HttpStatus.CREATED.value());
//        apiResponse.setData(viewUser);
//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
//    }
//
//    @PutMapping
//    public ResponseEntity<APIResponse> updateUser(@RequestBody UserModel userModel) {
//        UserModel updatedUser = userService.updateUser(userModel);
//        apiResponse.setStatus(HttpStatus.CREATED.value());
//        apiResponse.setData(updatedUser);
//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<APIResponse> deleteUser(@PathVariable Integer id) {
//        userService.delete(id);
//        apiResponse.setStatus(HttpStatus.CREATED.value());
//        apiResponse.setData(userService.getAllUser());
//        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
//    }
    }
}
