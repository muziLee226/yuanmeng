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
@TableName("T_ARTICLE")
public class Article implements Serializable {
    @TableId(value = "ID")
    private String id;//资讯id
    @TableField("TITLE")
    private String title;//
    @TableField("AUTHOR")
    private String author;
    @TableField("TYPE")
    private int type;//文章类型
    @TableField("LABEL")
    private String label;//标签
    @TableField("URL")
    private String url;//文章的链接地址
    @TableField("READ_COUNT")
    private int readCount;//文章阅读量
    @TableField("PUBLISH_TIME")
    private String publishTime;//发布时间
    @TableField("OWNER")
    private String owner;//创作人
    @TableField("ARTICLE_LOGO")
    private String articleLogo;//资讯图标
    @TableField("CONTENT")
    private String content;//资讯简短内容

}
