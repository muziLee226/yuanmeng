package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
//一问一答答案表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_ANSWER")
public class Answer implements Serializable {
    @TableId(value = "ID")
    private String id;//答案id

    @TableField("CONTENT")
    private String content;//内容
    @TableField("QUESTION_ID")
    private String questionId;//问题id
    @TableField("EXPERT_ID")
    private String expertId;

}
