package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbQuestionType {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 父类id
     */
    private Integer parentId;

    /**
     * 类名
     */
    private String name;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 操作时间
     */
    private Date updated;
}