package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_USER_HONORS")
public class UserHonors implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    private String url;//荣誉页面链接地址
    private String intro;//用户简介
}
