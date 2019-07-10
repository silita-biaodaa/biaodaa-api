package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbCompanyUpdate {
    /**
     * 主键id
     */
    private String pkid;

    /**
     * 企业id
     */
    private String comId;

    /**
     * 企业名称
     */
    private String comName;

    /**
     * 更新人用户id
     */
    private String userId;

    /**
     * 更新状态(0:正在更新中，1：初始化，2：更新完成)
     */
    private Integer isUpdated;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;
}