package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
//高考历年数据
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("CEEData")
public class CEEData implements Serializable {
    @TableId(value = "id")
    private String id;//id
    private int year;//年份
    @TableField("major_id")
    private String majorId;//专业id
    @TableField("minScore")
    private int minScore;//最低分
    @TableField("maxScore")
    private int maxScore;//最高分
    @TableField("minRank")
    private int minRank;//最低分位次
    @TableField("maxRank")
    private int maxRank;//最高分位次
    @TableField("enrollPlan")
    private int enrollPlan;//招生计划数
    @TableField("enrollLevel")
    private int enrollLevel;//招生层次
    @TableField("courseRequire")
    private String courseRequire;//选课要求
    private int tuition;//学费
    @TableField("enrollProvince")
    private String enrollProvince;//招生所在省份
    @TableField("enrollCode")
    private String enrollCode;//招生代码
    @TableField("admission_count")
    private int admissionCount;//录取人数
    @TableField("major_name")
    private String major_name;//专业名称

}
