package com.nseit.RestApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private List<UserModel> userModelList;
}
