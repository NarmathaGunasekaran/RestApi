package com.nseit.RestApi.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue
    private Integer UserId;
    private String Name;
    private Integer DOB;
    private String Education;
    private Integer Email;
    private long PhoneNumber;
    private String MaritalStatus;
    private Integer UserRoleId;
}
