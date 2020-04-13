package com.silita.biaodaa.model;

import lombok.Data;

import java.util.Date;

@Data
public class TbPhoneActivity {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 页面描述
     */
    private String description;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 创建时间
     */
    private Date created;

}