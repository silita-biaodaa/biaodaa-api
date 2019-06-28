package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbGsCompany {
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
     * 更新时间
     */
    private Date updated;

    /**
     * 基本信息
     */
    private String basic;

    /**
     * 股东信息
     */
    private String partner;

    /**
     * 主要人员
     */
    private String personnel;

    /**
     * 变更记录
     */
    private String changRecord;

    /**
     * 行政处罚
     */
    private String punish;

    /**
     * 分支机构
     */
    private String branch;
}