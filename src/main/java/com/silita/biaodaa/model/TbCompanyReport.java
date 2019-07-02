package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbCompanyReport {
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
     * 年份
     */
    private Integer year;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 年报(josn数据)
     */
    private String report;
}