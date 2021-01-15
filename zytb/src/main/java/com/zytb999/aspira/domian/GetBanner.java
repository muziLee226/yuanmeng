package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
//banner图表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_GET_BANNER")
public class GetBanner implements Serializable {
    @TableId(value = "ID")
    private String id;//答案id
    @TableField("IMG_URL")
    private String imgUrl;//图片存储地址
    @TableField("WEB_URL")
    private String webUrl;//BANNER跳转的url地址
    private int status;//图片状态
}
