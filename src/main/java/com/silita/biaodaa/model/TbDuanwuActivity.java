package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TbDuanwuActivity {

    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 被邀请人的user_id
     */
    private String invitedUid;

    /**
     * 邀请人手机号
     */
    private String invitePhone;

    /**
     * 支付状态(9:支付成功，10:退款，1:创建订单)
     */
    private Integer payState;

    /**
     * 支付金额(单位：分)
     */
    private Double payAmount;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 支付时间
     */
    private Date payd;

    /**
     * 支付类型(web:网页扫码,wap:移动H5,ios:苹果内购,app:安卓微信)
     */
    private String payType;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date updated;
}