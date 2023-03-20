package com.nseit.RestApi.repository;


import com.nseit.RestApi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

    void delete(UserModel userModel);

    void save(UserModel userModel);
}

