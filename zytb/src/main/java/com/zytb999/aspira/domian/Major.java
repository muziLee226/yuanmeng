package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

//专业基础信息表
@Getter
@Setter
@ToString
@AllArgsConstructor
/**
 * @TableName("user") 将当前的实体类和数据库的表建立联系
 * 注解参数：表名
 */
@TableName("T_MAJOR")
public class Major implements Serializable {

    @TableId(value = "ID")
    private String id;//专业名称id
    @TableField("FIRST_DISCIPLINE_NAME")
    private String firstDisciplineName;//所属大类名称
    @TableField("MAJOR_COL_NAME")
    private String majorcolName;//所属一级学科名称
    @TableField("INTRO")
    private String introduction;//专业描述
    @TableField("COURSE")
    private String course;//所学课程
    @TableField("LEVEL")
    private int level;//所属专业层次
    @TableField("TARGET")
    private String target;//专业培养目标
    @TableField("REQUIREMENT")
    private String requirement;//培养要求
    @TableField("CAPABILITY")
    private String capability;//培养知识能力
    @TableField("PRACTICE")
    private  String practice;//实践教学
    @TableField("CAREE_CHOICE")
    private String careeChoice;//就业去向概况
    @TableField("YEAR_READ")
    private String yearRead;//几年制
    @TableField("DEGREE")
    private String degree;//所获学位证书
    @TableField("FIRST_DISCIPLINE_ID")
    private String firstDisciplineId;//所属大奖id
    @TableField("NAME")
    private String name;//专业名称
    @TableField("MAJOR_COL_ID")
    private String majorcolId;//所属一级学科id
    /*@TableField("similar_majors")
    private String similarMajors;//相似专业
    @TableField("major_sch_wen")
    private String majorSchWen;//开设院校文科
    @TableField("major_sch_li")
    private String majorSchLi;//开设院校理科*/
    @TableField("CODE")
    private String CODE;//专业图标代码
    @TableField("MAJTAGS")
    private String majTags;//专业标签
    @TableField("MAJOR_LOGO")
    private String majorLogo;//专业图标

    private String[] majTagsArray;//标签数组形式
    private List<Similar> similarMajor;//相似专业
    private long SALARY;//月薪`
    private List<MajorClass> majorClass;
    public Major() {
    }


}
