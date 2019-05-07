package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TbQuestionInfo {
    /**
     * 主键id
     */
    private Integer pkid;

    /**
     * 案例id（如该题为案例题不允许为空）
     */
    private Integer caseId;

    /**
     * 题目大类（0:全部;1:土建;2:机械）
     */
    private Integer questionType;

    /**
     * 题目类型(1:单选;2:多选;3:判断;4:案例;5:简答)
     */
    private Integer subType;

    /**
     * 操作时间
     */
    private Date updated;

    /**
     * 题目
     */
    private String subject;

    /**
     * 回答
     */
    private String question;

    /**
     * 答案
     */
    private String answer;
}