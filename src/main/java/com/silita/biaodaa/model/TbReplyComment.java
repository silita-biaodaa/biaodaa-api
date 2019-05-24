package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Setter
@Getter
public class TbReplyComment {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 主评论id
     */
    private String commentId;

    /**
     * 关联id（中标，招标，企业）
     */
    private String relatedId;

    /**
     * 关联类型(zhongbiao:中标;zhaobiao:招标;company:公司)
     */
    private String relatedType;

    /**
     * 公告来源
     */
    private String source;

    /**
     * 被回复者用户id
     */
    private String toUid;

    /**
     * 被回复者昵称
     */
    private String toNikeName;

    /**
     * 回复者用户id
     */
    private String replyUid;

    /**
     * 回复者用户昵称
     */
    private String reNikeName;

    /**
     * 公司名
     */
    private String reCompany;

    /**
     * 职位
     */
    private String rePost;

    /**
     * 头像路径
     */
    private String reImage;

    /**
     * 回复时间
     */
    private Date updated;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 是否发布(1:是,0:否)
     */
    private Integer isPub;

    /**
     * 审核状态（0：审核中；1：审核通过；2：审核未通过；3：已屏蔽）
     */
    private Integer state;

    public TbReplyComment(Map<String, Object> param) {
        this.commentId = param.get("commentId").toString();
        this.relatedId = param.get("relatedId").toString();
        this.relatedType = param.get("relatedType").toString();
        this.toUid = param.get("toUid").toString();
        this.replyContent = param.get("replyContent").toString();
        this.replyUid = param.get("userId").toString();
        this.source = param.get("source").toString();
        this.isPub = 1;
        this.state = 1;
    }

}