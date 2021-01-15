package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
//VIP信息表
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_VIP_CARD")
public class VipCard implements Serializable {
    @TableId(value = "ID")
    private String id;//
    private int type;
    private String price;//价格
    @TableField("CARD_URL")
    private String cardUrl;//vip图片地址
    @TableField("PRODUCT_INTRO")
    private String productIntro;//产品介绍图片地址
    private String questions;//常见图片地址
}
