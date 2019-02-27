package com.silita.biaodaa.to;

import com.silita.biaodaa.model.TbVipFeeStandard;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 开通会员 to
 */
@Setter
@Getter
public class OpenMemberTO implements Serializable{
    private String channel;

    private String userId;

    private TbVipFeeStandard feeStandard;
}
