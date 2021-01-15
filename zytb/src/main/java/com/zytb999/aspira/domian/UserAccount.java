package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_USER_ACCOUNT")
public class UserAccount implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    @TableField("PHONE")
    private String phone;//手机号
    @TableField("PASSWORD")
    private String password;//密码
    @TableField("EMAIL")
    private String email;//邮件地址
    @TableField("REGIST_TIME")
    private Date registTime;//注册时间
    @TableField("LASTLOGIN_TIME")
    private Date lastLoginTime;//最后一次登录时间
    /*@TableField("secretKey")
    private String  secretKey;//密码加密的秘钥*/
    @TableField("INVITE_USER")
    private String inviteUser;//用户的邀请者
    @TableField("FRANCHISEE_ID")
    private String franchiseeId;//邀请他注册的代理商
    @TableField("COUNT_NUMBER")
    private int COUNT_NUMBER;
}
