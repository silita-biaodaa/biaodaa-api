package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbAwardHunan {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 公司id
     */
    private String comId;

    /**
     * 奖项名称
     */
    private String awardName;

    /**
     * 项目名称
     */
    private String projName;

    /**
     * 项目类型
     */
    private String projType;

    /**
     * 参与类型
     */
    private String joinType;

    /**
     * 年度
     */
    private String years;

    /**
     * 修改时间
     */
    private Date updated;
}