package com.silita.biaodaa.service;

/**
 * Created by zhushuai on 2019/4/17.
 */
public interface RedisService {

    /**
     * 存入redis队列
     * @param orderNo
     */
    void saveRedisMQ(String orderNo);

    /**
     * 消费队列
     * @param key
     * @return
     */
    String customerOrder(String key);
}
