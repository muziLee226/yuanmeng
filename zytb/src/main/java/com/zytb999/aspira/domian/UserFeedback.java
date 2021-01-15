package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_USER_FEEDBACK")
public class UserFeedback  implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    @TableField("USER_PHONE")
    private String userPhone;//用户联系方式
    private int type;//反馈类型
    private String content;//反馈内容
    @TableField("CONTACT_INFO")
    private String contactInfo;//联系方式
}
