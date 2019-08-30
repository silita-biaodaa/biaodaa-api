package com.silita.biaodaa.service;

import java.util.Map;

/**
 * 活动
 * Created by zhushuai on 2019/6/4.
 */
public interface ActivityService {

    /**
     * 保存订单
     * @param param
     */
    void saveOrderNo(Map<String,Object> param);

    /**
     * 修改订单号
     * @param param
     */
    void updatePayState(Map<String,Object> param);

    /**
     * 近期是否有活动
     * @return
     */
    boolean isActivity();
}
