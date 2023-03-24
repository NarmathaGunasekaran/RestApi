package com.nseit.RestApi.service;

import com.nseit.RestApi.model.RoleModel;
import com.nseit.RestApi.model.UserModel;
import com.nseit.RestApi.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public RoleModel save(RoleModel roleModel) {
        roleRepository.save(roleModel);
        return roleModel;
    }

    public List<RoleModel> findAll() {
        return roleRepository.findAll();
    }

    public void update(RoleModel roleModel) {
        roleRepository.save(roleModel);
    }

    public void deleteRole(Integer id) {
        roleRepository.findById(id);
        roleRepository.deleteById(id);
    }
}
