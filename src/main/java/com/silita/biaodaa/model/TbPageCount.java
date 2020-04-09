package com.silita.biaodaa.model;

import lombok.Data;

import java.util.Date;

@Data
public class TbPageCount {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 页面url
     */
    private String page;

    /**
     * 统计页面访问次数
     */
    private Integer pageCount;

    /**
     * 页面描述
     */
    private String description;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 创建时间
     */
    private Date created;
}