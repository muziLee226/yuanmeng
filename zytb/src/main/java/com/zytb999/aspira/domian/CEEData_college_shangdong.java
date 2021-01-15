package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

//(高校招生信息表)山东
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
/**
 * @TableName("user") 将当前的实体类和数据库的表建立联系
 * 注解参数：表名
 */
@TableName("T_CEEDATA_COLLEGE_SHANDONG")
public class CEEData_college_shangdong implements Serializable {
    @TableField(value = "ID")
    private String id;
    @TableField(value = "YEAR")
    private int year;//年份
    @TableField(value = "COLLEGE_ID")
    private String collegeId;//大学id
    @TableField(value = "MAX")
    private int maxScore;//最高分
    @TableField(value = "MIN")
    private int minScore;//最低分
    @TableField(value = "MAX_RANK")
    private int maxRank;//最高分位次
    @TableField(value = "MIN_RANK")
    private int minRank;//最低分位次
    @TableField(value = "ENROLL_PLAN")
    private int enrollPlan;//招生计划数
    @TableField(value = "ENROLL_REGULATION")
    private String enrollRegulation;//招生章程
    @TableField(value = "SELECT_TEST_REQUIRE")
    private String selectTestRequire;//选测要求
    @TableField(value = "ENROLL_PROVINCE")
    private String enrollProvince;//招生所在省份
    @TableField(value = "ENROLL_CODE")
    private String enrollCode;//专业招生代码
    @TableField(value = "WENLI")
    private int wenli;//文理科
    @TableField(value = "COLLEGE_NAME")
    private String collegeName;//学校名称
    @TableField(value = "BATCH")
    private String batch;//批次
    private int lowDiffer;//最低分线差
    @TableField("FORW_SCORE")
    private double forwScore;//预估分
}
