package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

//后台管理表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_BACKGROUND_MANAGER")
public class BackgroundManager implements Serializable {
    @TableId(value = "ID")
    private String id;//id

    @TableField("NAME")
    private String name;//名字
    @TableField("PHONE")
    private String phone;//电话
    @TableField("AVATAR")
    private String avatar;//头像
    @TableField("INTRO")
    private String intro;//个人介绍
    @TableField("USER_TYPE")
    private int userType;//用户类型(0：超级管理员（内置用户）1：用户管理员2：权限管理员3：内部员工4：专家)
    @TableField("SUPERIOR_ID")
    private String superiorId;//上级id
    @TableField("PASSWORD")
    private String password;
    @TableField("SECRET_KEY")
    private String secretKey;//用户的秘钥
    @TableField("PERMISSION")
    private String permission;//json格式存储，管理员权限

}
