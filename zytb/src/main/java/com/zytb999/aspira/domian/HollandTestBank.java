package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

//霍兰德职业兴趣测评
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_HOLLAND_TEST_BANK")
public class HollandTestBank implements Serializable {
    @TableId(value = "ID")
    private String id;

    @TableField("TEST")
    private String test;
    @TableField("ANSWER")
    private String answer;


}
