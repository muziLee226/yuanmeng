package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

//加盟商数据表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_FRANCHISEE")
public class Franchisee implements Serializable {
    @TableId(value = "ID")
    private String id;//id

    @TableField("TYPE")
    private int type;//类型(0：加盟商 1：代理商)
    @TableField("NAME")
    private String name;
    @TableField("PHONE")
    private String phone;
    @TableField("ALTER_PHONE")
    private String alterPhone;//备用电话
    @TableField("ADDRESS")
    private String address;
    @TableField("PROVINCE")
    private String province;
    @TableField("CITY")
    private String city;//所在地级市
    @TableField("DISTRICT")
    private String district;//区
    @TableField("JOIN_TIME")
    private Date joinTime;//加盟时间
    @TableField("WECHART_NUM")
    private String wechartNum;//微信账号
    @TableField("HIGHER_FRANCHISEE_ID")
    private String higherFranchiseeId;//上级代理商id
    @TableField("MANAGE_AREA")
    private String manageArea;//所管理区域
    @TableField("ACCOUNT")
    private double account;//代理商的账户
    @TableField("BANK_NAME")
    private String bankName;//开户行
    @TableField("BANK_NUMBER")
    private String bankNumber;//银行账号


}
