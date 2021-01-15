package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

//用户权限表
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_USER_RIGHTS")
public class UserRights implements Serializable{
    @TableId(value = "ID")
    private String id;//id
    @TableField(value = "VIP_LEVEL")
    private int VIPLevel;//权限类型
    @TableField(value = "VIP_TIMELIMITED")
    private Date VIPTimeLimited;//VIP权限截止时间
    @TableField(value = "ANSWER_COUNT")
    private int answerCount;//剩余查看问答的次数
    @TableField(value = "ASK_COUNT")
    private int askCount;//剩余的提问的次数
    @TableField(value = "DIANPING_COUNT")
    private int dianpingCount;//剩余志愿点评的次数
    @TableField(value = "PHONE")
    private String phone;
}
