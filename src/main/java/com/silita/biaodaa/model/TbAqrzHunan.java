package com.silita.biaodaa.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_aqrz_hunan")
public class TbAqrzHunan {
    /**
     * 主键id
     */
    @Id
    private Integer pkid;

    /**
     * 公司id
     */
    @Column(name = "com_id")
    private String comId;

    /**
     * 等级
     */
    private String grade;

    /**
     * 地区
     */
    private String region;

    /**
     * 评定日期
     */
    private String issued;

    /**
     * 有效期
     */
    private String valided;

    /**
     * 修改时间
     */
    private Date updated;

    /**
     * 获取主键id
     *
     * @return pkid - 主键id
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * 设置主键id
     *
     * @param pkid 主键id
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取公司id
     *
     * @return com_id - 公司id
     */
    public String getComId() {
        return comId;
    }

    /**
     * 设置公司id
     *
     * @param comId 公司id
     */
    public void setComId(String comId) {
        this.comId = comId;
    }

    /**
     * 获取等级
     *
     * @return grade - 等级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置等级
     *
     * @param grade 等级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取地区
     *
     * @return region - 地区
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置地区
     *
     * @param region 地区
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 获取评定日期
     *
     * @return issued - 评定日期
     */
    public String getIssued() {
        return issued;
    }

    /**
     * 设置评定日期
     *
     * @param issued 评定日期
     */
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * 获取有效期
     *
     * @return valided - 有效期
     */
    public String getValided() {
        return valided;
    }

    /**
     * 设置有效期
     *
     * @param valided 有效期
     */
    public void setValided(String valided) {
        this.valided = valided;
    }

    /**
     * 获取修改时间
     *
     * @return updated - 修改时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置修改时间
     *
     * @param updated 修改时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}