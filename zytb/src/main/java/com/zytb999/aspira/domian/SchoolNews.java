package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_SCHOOL_NEWS")
public class SchoolNews implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    @TableField("IMAGE")
    private String image;//新闻图片
    @TableField("TITLE")
    private String title;//新闻标题
    @TableField("SCHOOL_LOGO")
    private String schoolLogo;//学校LOGO
    @TableField("SCHOOL_NAME")
    private String schoolName;//学校名称
    @TableField("ARTILE_URL")
    private String artileUrl;//文章链接地址
    @TableField("PUBLISH_TIME")
    private String publishTime;//发布时间
}
