package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbReviewFine {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 公司id
     */
    private String comId;

    /**
     * 项目名称
     */
    private String projName;

    /**
     * 评定日期
     */
    private String issued;

    /**
     * 奖项名称
     */
    private String awardName;

    /**
     * 考评类型(工地:project;企业:company)
     */
    private String type;

    /**
     * 修改时间
     */
    private Date updated;
}