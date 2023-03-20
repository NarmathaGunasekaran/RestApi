package com.nseit.RestApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;

@Data
@AllArgsConstructor
public class RoleModel {

    @Id
    private Integer RoleId;
    private String RoleName;
}
