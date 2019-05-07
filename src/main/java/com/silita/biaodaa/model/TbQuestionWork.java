package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TbQuestionWork {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 题目id
     */
    private Integer questionId;

    /**
     * 题目类型(1:单选;2:多选;3:判断;4:案例;5:简答;)
     */
    private Integer subType;

    /**
     * 业务类型（1:错题;2:收藏;3:做题记录）
     */
    private Integer workType;

    /**
     * 操作时间
     */
    private Date updated;
}