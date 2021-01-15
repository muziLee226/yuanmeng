package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

//野鸡大学列表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_FAKE_COLLEGE")
public class FakeCollege implements Serializable {
    @TableId(value = "ID")
    private String id;//id

    @TableField("INTRO")
    private String intro;//介绍
    @TableField("NAME")
    private String name;


}
