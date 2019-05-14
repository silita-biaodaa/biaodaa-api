package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class TbProjectTraffic {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 施工单位
     */
    private String comName;

    /**
     * 项目名称
     */
    private String proName;

    /**
     * 项目类别
     */
    private String proType;

    /**
     * 标段名
     */
    private String section;

    /**
     * 项目地区
     */
    private String proWhere;

    /**
     * 信息来源
     */
    private String source;

    /**
     * 建设状态
     */
    private String build;

    /**
     * 技术等级
     */
    private String technicalGrade;

    /**
     * 合同价格
     */
    private String contractAmount;

    /**
     * 结算价格
     */
    private String clearingAmount;

    /**
     * 开工日期
     */
    private String begined;

    /**
     * 交工日期
     */
    private String ended;

    /**
     * 合同段开始桩号
     */
    private String stakeBegin;

    /**
     * 合同段结束桩号
     */
    private String stakeEnd;

    /**
     * 质量评定情况
     */
    private String assess;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 主要工程量
     */
    private String remark;

    /**
     * 人员
     */
    private List<TbTrafficPerson> persons;
}