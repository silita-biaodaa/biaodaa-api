package com.silita.biaodaa.service;

import com.github.pagehelper.PageInfo;
import com.silita.biaodaa.model.Page;
import com.silita.biaodaa.model.TbVipFeeStandard;
import com.silita.biaodaa.to.OpenMemberTO;

import java.util.List;
import java.util.Map;

/**
 * Created by dh on 2019/1/28.
 */
public interface VipService {
    List<TbVipFeeStandard> queryFeeStandard(String channel);

    Map<String,Object> getFeeStandards();

    PageInfo queryProfitInfo(Page page, String userId);

    Integer queryProfitTotal(String userId);

    String openMemberRights(OpenMemberTO openMemberTO);

    TbVipFeeStandard queryFeeStdInfoByCode(String stdCode);

    String addUserProfit(String channel,String userId, String sCode,String... others);

    Integer queryUserProfitCount(String sCode,String userId);

    /**
     * 开通会员后发送系统消息
     * @param userId
     * @param stdCode
     */
    void sendUserVipMessage(String userId,String stdCode);
}
