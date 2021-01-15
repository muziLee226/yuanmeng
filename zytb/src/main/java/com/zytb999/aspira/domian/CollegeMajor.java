package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_COLLEGE_MAJOR")
/**
 * Serializable序列化接口
 */
public class CollegeMajor implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    @TableField(value = "MAJOR_ID")
    private String majorId;//专业id
    @TableField(value = "COLLEGE_ID")
    private String collegeId;//学校id
    @TableField(value = "STATUS")
    private boolean status;//状态标志位
    @TableField(value = "MAJOR_NAME")
    private String majorName;//专业名称
    @TableField(value = "MAJOR_CODE")
    private int majorCode;//专业招生代码
    @TableField(value = "ADMISSION_COUNT")
    private int admissionCount;//录取人数
    @TableField(value = "PLAN_COUNT")
    private int planCount;//计划招生人数
    @TableField(value = "YEAR_READ")
    private String yearRead;//几年制
    @TableField(value = "TUITION")
    private String tuition;//学费
    @TableField(value = "MIN_SCORE")
    private int minScore;//最低分
    @TableField(value = "MIN_SCORE_RANK")
    private int minScoreRank;//最低分排名
    @TableField(value = "MAX_SCORE")
    private int maxScore;//最高分
    @TableField(value = "MIN_SCORE_DIFF")
    private int minScoreDiff;//最低分线差
    @TableField(value = "MAX_SCORE_RANK")
    private int maxScoreRank;//最高分排名
    @TableField(value = "MAX_SCORE_DIFF")
    private int maxScoreDiff;//最高分线差


}
