package com.silita.biaodaa.service;

/**
 * Created by zhushuai on 2019/4/18.
 */
public interface PDFService {

    /**
     * 生成pdf
     * @param order
     * @return
     */
    boolean buildPdf(String order);

}
