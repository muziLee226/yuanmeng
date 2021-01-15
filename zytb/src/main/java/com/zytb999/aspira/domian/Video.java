package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@TableName("T_VIDEO")
public class Video implements Serializable {
    @TableId(value = "ID")
    private String id;//
    @TableField("TITLE")
    private String title;
    @TableField("AUTHOR")
    private String author;
    @TableField("TYPE")
    private int type;//文章类型
    @TableField("LABEL")
    private String  label;//标签
    @TableField("URL")
    private String url;//文章的链接地址
    @TableField("READ_COUNT")
    private int readCount;//文章阅读量
    @TableField("PUBLISH_TIME")
    private String publishTime;//
    @TableField("OWNER")
    private String owner;//创作人
}
