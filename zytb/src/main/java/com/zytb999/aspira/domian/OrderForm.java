package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

//学生志愿表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_ORDERFORM")
public class OrderForm {
    @TableId(value = "ID")
    private String id;
    @TableField("ORDER_FORM")
    @JsonIgnore
    private String orderForm;//志愿表
    @TableField("ORDER_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;//志愿生成的时间
    @TableField("ISNEW")
    private int isnew;//是否是最新的志愿表
    @TableField("USER_ID")
    private String userId;//

    private List<Map> orderList;

    // 批次
    @TableField("BATCH")
    private String batch;

    // 高考类型：0：老高考，1：新高考
    @TableField("TYPE")
    private Integer type;

    // 文理科：0：文科，1：理科
    @TableField("WENLI")
    private Integer wenLi;

}
