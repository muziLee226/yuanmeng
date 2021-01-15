package com.zytb999.aspira.domian;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_ACTIVATION_CODE")
//激活码表
public class ActivationCode implements Serializable {
    @TableId(value = "ID")
    private String id;//
    @TableField("STATUS")
    private int status;//激活码状态
    @TableField("TYPE")
    private int type;//权限类型
    @TableField("NUMBER")
    private String number;//激活码
    @TableField("VIP_RIGHTS_ID")
    private String VipRightsId;//T_VIP_RIGHTS的id
    @TableField("USER_ID")
    private String userId;
}
