package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * 会员收费标准
 */
@Getter
@Setter
public class TbVipFeeStandard implements Serializable {
    private String feeStdId;
    private String stdCode;
    private double price;
    private double primePrice;
    private String primeUnit;
    private int vipDays;
    private String stdDesc;
    private String altInfo;
    private String discountId;
    private boolean state;
    private String channel;
    private String productId;
    private String remark;
    private Timestamp updated;
    private String updateBy;
}
