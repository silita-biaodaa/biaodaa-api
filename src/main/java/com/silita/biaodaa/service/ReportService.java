package com.silita.biaodaa.service;

import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * Created by zhushuai on 2019/4/17.
 */
public interface ReportService {

    PageInfo listHistory(Map<String, Object> param);

    Map<String, Object> saveCondition(Map<String, Object> param);

    /**
     * 保存订单号
     * @param param
     */
    void saveReportOrder(Map<String,Object> param);

    /**
     * 修改订单状态
     */
    void updateReportOrderPayStatus(String orderNo, String resultCode,String transactionId);

    /**
     * 修改邮箱
     * @param param
     */
    boolean updateReportEmail(Map<String, Object> param);

    /**
     * 设置资质名称
     * @param param
     */
    void setQualName(Map<String, Object> param);

    /**
     * 根据订单查询信息
     * @return
     */
    Map<String,Object> getReportMap(Map<String,Object> param);

    /**
     ** 修改报告reportPath
     **@param param
     */
    void updateReportPath(Map<String,Object> param);

}
