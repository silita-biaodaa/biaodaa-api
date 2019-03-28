package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TbReviewDiff {
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
     * 有效期
     */
    private String valided;

    /**
     * 评审名称
     */
    private String review;

    /**
     * 考评类型(项目:project;企业:company)
     */
    private String type;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 评定不合格原因
     */
    private String remark;

}