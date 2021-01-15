package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

//高考历年数据(河南）
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_CEEDATA_HENAN")
public class CEEDataHN implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    @TableId(value = "YEAR")
    private int year;//年份
    @TableId(value = "COLLEGE_ID")
    private String collegeId;
    @TableField("MAJOR_ID")
    private String majorId;//专业id
    @TableField("MIN_SCORE")
    private int minScore;//最低分
    @TableField("MAX_SCORE")
    private int maxScore;//最高分
    @TableField("MIN_RANK")
    private int minRank;//最低分位次
    @TableField("MAX_RANK")
    private int maxRank;//最高分位次
    @TableField("ENROLL_PLAN")
    private int enrollPlan;//招生计划数
    @TableField("ENROLL_LEVEL")
    private int enrollLevel;//招生层次
    @TableField("TUITION")
    private String tuition;//学费
    // @TableField("")
    //private String courseRequire;//选课要求
    @TableField("ENROLL_PROVINCE")
    private String enrollProvince;//招生所在省份
    @TableField("ENROLL_CODE")
    private String enrollCode;//招生代码
    @TableField("WENLI")
    private int wenli;//文理科
    @TableField("YEAR_READ")
    private String yearRead;//几年制
    @TableField("ADMISSION_COUNT")
    private int admissionCount;//录取人数
    @TableField("MAJOR_NAME")
    private String majorName;//专业名称
    @TableField("MAJOR_CODE")
    private int majorCode;//专业代码
    @TableField("COLLEGE_NAME")
    private String collegeName;//学校名
    @TableField("COLLEGE_CODE")
    private int collegeCode;//院校代码
    @TableField("FIRST_SELECT")
    private String firstSelect;//首选科目要求
    @TableField("LEFT_SELECT1")
    private String leftSelect1;//再选科目1要求
    @TableField("LEFT_SELECT2")
    private String leftSelect2;//再选科目2要求
    @TableField("T_CEEDATA_COLLEGE_HENAN_ID")
    private String T_CEEDATA_COLLEGE_HENAN_ID;
    @TableField("FORW_SCORE")
    private double forwScore;//预估分
    @TableField("BATCH")
    private String batch;//专业批次
    @TableField("EXPLAIN")
    private String explain;//专业招生说明
    private String majorEnrollCode;
    private String collgeEnrollCode;
    private int uniPlan;//院校计划招生数
}
