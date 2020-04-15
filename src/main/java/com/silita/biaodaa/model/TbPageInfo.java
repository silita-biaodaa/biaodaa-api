package com.silita.biaodaa.model;

import lombok.Data;

import java.util.Date;

@Data
public class TbPageInfo {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 页面url
     */
    private String page;

    /**
     * 页面描述
     */
    private String description;

    /**
     * 详细信息
     */
    private String info;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 创建时间
     */
    private Date created;
}