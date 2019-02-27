package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SysUserRole  implements Serializable {
    private String pkid;
    private String roleId;
    private String userId;
    private String created;
    private String createBy;

    private String roleCode;

}