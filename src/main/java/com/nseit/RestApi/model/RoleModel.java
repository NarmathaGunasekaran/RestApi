package com.nseit.RestApi.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoleModel {

    @Id
    private Integer RoleId;
    private String RoleName;
}
