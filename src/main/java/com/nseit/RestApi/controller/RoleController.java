package com.nseit.RestApi.controller;

import com.nseit.RestApi.model.RoleModel;
import com.nseit.RestApi.model.UserModel;
import com.nseit.RestApi.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping
    public Integer add(@RequestBody RoleModel roleModel) {
        return roleService.save(roleModel).getId();
    }

    @GetMapping
    List<RoleModel> getUsers() {
        return roleService.findAll();
    }

    @PutMapping
    void update(@RequestBody RoleModel roleModel) {
        roleService.update(roleModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserModel> deleteRole(@PathVariable Integer id) {

        roleService.deleteRole(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
