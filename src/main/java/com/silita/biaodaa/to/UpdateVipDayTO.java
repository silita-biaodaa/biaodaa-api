package com.silita.biaodaa.to;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dh on 2019/2/20.
 */
@Setter
@Getter
public class UpdateVipDayTO implements Serializable {
    int vipInfoRecord;
    String vid;
    Date hisExpiredDate;
    int roleUpdateCount;
}
