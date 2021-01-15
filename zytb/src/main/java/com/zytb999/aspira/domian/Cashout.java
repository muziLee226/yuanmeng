package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

//提现记录表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_CASHOUT")
public class Cashout implements Serializable {
    @TableId(value = "ID")
    private String id;//id

    @TableField("REQUIRE_TIME")
    private Date requireTime;//申请提现时间
    @TableField("AMOUNT")
    private double amount;//提现金额
    @TableField("STATE")
    private int state;//提现状态
    @TableField("DETAIL")
    private String detail;//提现备注详情，包括失败详情
    @TableField("FRANCHISEE_ID")
    private String franchiseeId;//提现代理商
    @TableField("OPERATOR_ID")
    private String operatorId;//提现操作员工id

}
