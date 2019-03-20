package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbTrafficPerson {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 项目id
     */
    private Integer proId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 岗位
     */
    private String post;

    /**
     * 任职开始日期
     */
    private String begined;

    /**
     * 任职结束日期
     */
    private String ended;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;

}