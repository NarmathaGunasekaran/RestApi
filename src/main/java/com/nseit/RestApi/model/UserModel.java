package com.nseit.RestApi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.convert.Jsr310Converters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue
    private Integer UserID;
    private String Name;
    private String DOB;
    private String Education;
    private String Email;
    private Long PhoneNumber;
    private String MaritalStatus;
    private Integer UserRoleID;
}
