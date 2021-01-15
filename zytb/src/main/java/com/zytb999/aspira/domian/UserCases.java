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
@TableName("T_USER_CASES")
public class UserCases implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    private String url;//用户视频链接
    private String info;//用户简介
    private String content;//用户录取的信息
}
