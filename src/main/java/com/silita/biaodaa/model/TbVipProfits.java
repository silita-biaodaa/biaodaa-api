package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户收益实体
 */
@Getter
@Setter
public class TbVipProfits  implements Serializable {
    private String vProfitsId;
    private String settingsCode;
    private String vId;
    private String inviterCode;
    private Date hisExpiredDate;
    private String created;
    private String createBy;
    private String desc;
    private int increaseDays;
}
