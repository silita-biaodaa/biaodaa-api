package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbAwardNationwide {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 奖项类型
     */
    private String awardCate;

    /**
     * 奖项名称
     */
    private String awardName;

    /**
     * 工程名称
     */
    private String projName;

    /**
     * 项目类型
     */
    private String projType;

    /**
     * 项目经理
     */
    private String projManager;

    /**
     * 技术负责人
     */
    private String skillManager;

    /**
     * 质量负责人
     */
    private String qualityManager;

    /**
     * 技术质量负责人
     */
    private String techQualManage;

    /**
     * 总监理工程师
     */
    private String superPerson;

    /**
     * 建设面积
     */
    private String acreage;

    /**
     * 备注
     */
    private String remark;

    /**
     * 发布单位
     */
    private String pubOrg;

    /**
     * 发布日期
     */
    private String issued;

    /**
     * 省份
     */
    private String source;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 单位名称（企业名称/企业id多个用','隔开）
     */
    private String unitOrg;

    /**
     * 建设单位
     */
    private String buildOrg;

    /**
     * 监理单位
     */
    private String superOrg;

    /**
     * 勘察单位
     */
    private String exploreOrg;

    /**
     * 设计单位
     */
    private String designOrg;

    /**
     * 监督单位
     */
    private String checkOrg;

    /**
     * 参建单位
     */
    private String joinOrg;
}