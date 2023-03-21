package com.nseit.RestApi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.convert.Jsr310Converters;


@Entity
//@Table(name = "users")
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
