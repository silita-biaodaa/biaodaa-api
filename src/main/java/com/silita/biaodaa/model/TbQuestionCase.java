package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbQuestionCase {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 操作时间
     */
    private Date updated;

    /**
     * 案例名称
     */
    private String caseName;
}