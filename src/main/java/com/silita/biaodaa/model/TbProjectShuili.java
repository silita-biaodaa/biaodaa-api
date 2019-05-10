package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public class TbProjectShuili {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 企业id
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
     * 建设单位
     */
    private String proOrg;

    /**
     * 所在地
     */
    private String proWhere;

    /**
     * 工程状态
     */
    private String proStatus;

    /**
     * 合同金额
     */
    private String contractAmount;

    /**
     * 结算金额
     */
    private String clearingAmount;

    /**
     * 开工日期
     */
    private String worked;

    /**
     * 完工日期
     */
    private String finished;

    /**
     * 合同工期
     */
    private String duration;

    /**
     * 关键指标
     */
    private String majorTarget;

    /**
     * 合同主要内容
     */
    private String contractContent;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 主要参加人员
     */
    private String persons;

    /**
     * 工程获奖
     */
    private String prizes;

    /**
     * 项目负责人
     */
    private List<Map<String,Object>> leaderPersons;

    /**
     * 主要人员
     */
    private List<Map<String,Object>> mainPersons;

    /**
     * 工程获奖
     */
    private List<Map<String,Object>> proPrizes;
}