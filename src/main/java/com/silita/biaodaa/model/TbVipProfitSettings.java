package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员活动收益标准
 */
@Getter
@Setter
public class TbVipProfitSettings  implements Serializable {
    private String pSettingsId;
    private String settingsCode;
    private String desc;
    private int vipDays;
    private Date begin_date;
    private Date end_date;
    private String channel;
    private boolean state;//是否可用
    private String created;
    private String create_by;
    private String updated;
    private String update_by;
}
