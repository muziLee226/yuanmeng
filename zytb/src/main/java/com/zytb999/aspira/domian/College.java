package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//大学基础信息类
@Getter
@Setter
@ToString
@AllArgsConstructor
@TableName("T_COLLEGE")
public class College implements Serializable {
    @TableId(value = "ID")
    private String id;//学校id
    @TableField("NAME")
    private String name;//学校名称
    @TableField("PROVINCE")
    private String province;//省份
    @TableField("CITY")
    private String city;//学校所在城市
    @TableField("ADDRESS")
    private String address;//学校地址
    @TableField("CODE")
    private String code;//学校代码
    @TableField("TYPE")
    private int type;//院校类型
    @TableField("LEVEL")
    private int level;//办学程次
    @TableField("IS985")
    private int is985;//是否为985
    @TableField("IS211")
    private int is211;//是否为211
    @TableField("ISDOUBLETOP")
    private int isDoubleTop;//是否是双一流
    @TableField("HAS_POSTGRADUATE")
    private int hasPostgraduate;//是否有研究生院
    @TableField("ATTACHEDTO")
    private String attachedTo;//隶属于
    @TableField("WEBSITE")
    private String website ;//官网
    @TableField("PHONE")
    private String phone;//招生电话
    @TableField("CAREER_CHOICE")
    private String careerChoice;//就业去向
    //private String introduction;//学校简介
    @TableField("SCHOOL_LOGO")
    private String  schoolLogo;//校徽logo的url地址
    @TableField("INSTRUCTION")
    private String  instruction;//学校介绍json格式
    @TableField("ATTRIBUTE")
    private String attribute;//学校属性
    @TableField("ISDEP")
    private int isdep;//是否是独立学院
    @TableField("TAGS")
    private String tags;//学校标签描述
    @TableField("XYH_RANK_IDX")
    private String xyhRankIdx;

    private  String[] tagsArray;//标签数组形式
    private CollegeIntro collegeIntro;//学校一些详情信息
    private UniRank uniRank;//关联学校排行
    private List<SchRecom> recoms;//关联相似院校
    private List majors;

    //关联属性；new避免空指针
    //private List<SchoolRank> schoolRanks=new ArrayList<>();
    public College() {
    }
}
