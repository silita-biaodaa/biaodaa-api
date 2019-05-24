package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Setter
@Getter
public class TbCommentInfo {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 评论者昵称
     */
    private String nickName;

    /**
     * 公司
     */
    private String inCompany;

    /**
     * 职位
     */
    private String post;

    /**
     * 头像地址
     */
    private String image;

    /**
     * 评论者id
     */
    private String userId;

    /**
     * 关联id（中标，招标，公司id）
     */
    private String relatedId;

    /**
     * 关联类型(zhongbiao,zhaobiao,company)
     */
    private String relatedType;

    /**
     * 是否发布(1:是,0:否)
     */
    private Integer isPub;

    /**
     * 审核状态（0：审核中；1：审核通过；2：审核未通过；3：已屏蔽）
     */
    private Integer state;

    /**
     * 公告来源
     */
    private String source;

    /**
     * 发布时间
     */
    private Date updated;

    /**
     * 评论内容
     */
    private String commContent;

    public TbCommentInfo(Map<String,Object> param){
        this.userId = param.get("userId").toString();
        this.relatedId = param.get("relatedId").toString();
        this.relatedType = param.get("relatedType").toString();
        this.commContent = param.get("commContent").toString();
        this.source = param.get("source").toString();
        this.isPub = 1;
        this.state = 1;
    }
}