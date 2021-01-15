package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

//加盟商账户交易记录表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_FRANCHISE_ACCOUNT_RECORD")
public class FranchiseAccountRecord implements Serializable {
    @TableId(value = "ID")
    private String id;//id

    @TableField("RECORD_TIME")
    private Date recordTime;//交易时间
    @TableField("RECORD_TYPE")
    private int recordType;//交易类型
    @TableField("AMOUNT")
    private double expertId;//金额
    @TableField("ACCOUNT_NEW")
    private double accountNew;//交易后金额
    @TableField("DETAIL")
    private String detail;//详细说明
    @TableField("FRANCHISE_ID")
    private String franchiseId;//提现代理商

}
