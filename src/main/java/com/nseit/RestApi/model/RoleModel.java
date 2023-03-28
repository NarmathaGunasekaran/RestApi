package com.nseit.RestApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String RoleName;

    @JsonIgnore
    @OneToMany(mappedBy = "roleModel", cascade = CascadeType.REMOVE)
    Set<UserModel> enrolledUser = new HashSet<>();

    public static void setEnrolledUser(RoleModel roleModel) {
    }
}
