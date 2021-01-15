package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
/**
 * @TableName("user") 将当前的实体类和数据库的表建立联系
 * 注解参数：表名
 */
@TableName("T_USER")
public class User implements Serializable {
    /**
     * 主键属性  @TableId
     *
     * value 该属性对应的数据库表中的字段名
     * type 主键自增的类型 AUTO 代表自动递增
     */
    @TableId(value = "ID",type= IdType.INPUT)
    private String id;  //用户id
    /**
     * 非主键属性  @TableField
     *  @TableField("username")  参数为该属性对应的数据库表中的字段名
     *
     */
    @TableField("NAME")
    private String name;//用户姓名
    @TableField("AGE")
    private int age;    //用户年龄
    @TableField("GRADE")
    private String grade; //用户毕业年限
    @TableField("PROVINCE")
    private String province;  //用户所在省份
    @TableField("CITY")
    private String city;    //用户所在城市
    @TableField("SCORE")
    private double score;    //高考分数
    @TableField("MBTITEST_RESULT")
    private String mbtiTestResult;//MBTI测试结果
    @TableField("HOLANDTEST_RESULT")
    private String holandTestResult;//霍兰德测试结果
    @TableField("SCHOOL")
    private String school;//高中所在学校
    @TableField("PHONE")
    private String phone;//手机号
    //private String password;//密码
    @TableField("CHINESE_SCORE")
    private double chineseScore;
    @TableField("MATH_SCORE")
    private double mathScorce;
    @TableField("FOREIGN_SCORE")
    private double foreignScore;
    @TableField("FIRST_SELECT_NAME")
    private String firstSelectName;
    @TableField("FIRST_SELECT_SCORE")
    private double firstSelectScore;
    @TableField("LEFT_SELECT1_NAME")
    private String leftSelect1Name;
    @TableField("LEFT_SELECT1_SCORE")
    private double leftSelect1Score;
    @TableField("LEFT_SELECT2_NAME")
    private String leftSelect2Name;
    @TableField("LEFT_SELECT2_SCORE")
    private double leftSelect2Score;
    @TableField("ADD_SCORE")
    private String addScore;
    @TableField("WENLI")
    private String WENLI;
    @TableField("IDENTITY")
    private int IDENTITY;
    @TableField("AREA")
    private String area;
    @TableField(exist = false)
    private String cityCode;
}
