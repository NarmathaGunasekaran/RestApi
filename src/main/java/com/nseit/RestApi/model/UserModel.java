package com.nseit.RestApi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private String DOB;
    private String Education;
    private String Email;
    private Long PhoneNumber;
    private String MaritalStatus;
    private Integer UserRoleID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Role_id", referencedColumnName = "id")
    private RoleModel roleModel;
}
