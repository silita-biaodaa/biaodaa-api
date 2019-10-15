package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbHighwayCredit {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 企业id
     */
    private String comId;

    /**
     * 企业名称
     */
    private String comName;

    /**
     * 信用评价等级
     */
    private String level;

    /**
     * 评价年份
     */
    private Integer years;

    /**
     * 颁发身份
     */
    private String issueProvince;

    /**
     * 企业属地
     */
    private String regisAddress;

    /**
     * 创建时间
     */
    private Date created;
}