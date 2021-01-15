package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
//开设某个专业的学校
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_MAJOR_COLLEGE")
/**
 * Serializable序列化接口
 */
public class MajorCollege implements Serializable {
    @TableId(value = "ID")
    private String id;//学校id
    @TableField("MAJOR_ID")
    private String majorId;//专业id
    @TableField("COLLEGE_ID")
    private String collegeId;//高校id
    @TableField("COLLEGE_LOGO")
    private String collegeLogo;//学校logo的url
    @TableField("PROVINCE_ID")
    private String provinceId;//学校省份id
    @TableField("PROVINCE_NAME")
    private String provinceName;//学校省份名称
    @TableField("CITY_ID")
    private String cityId;//学校所属城市id
    @TableField("CITY_NAME")
    private String cityName;//学校城市名称
    @TableField("COLLEGE_NAME")
    private String collegeName;
    @TableField("COLLEGE_CODE")
    private String collegeCode;
    @TableField("COLLEGE_TYPE")
    private String collegeType;
    @TableField("LEVEL")
    private int level;//学校层次
    @TableField("SCH_TYPE_TAG")
    private String schTypeTag;//学校类型标签
    @TableField("WSL_RANK_IDX")
    private int wslRankIdx;//武书连排名
    @TableField("XYH_RANK_IDX")
    private int xyhRankIdx;//校友会排名
    @TableField("QS_RANK_IDX")
    private int qsRankIdx;//QS内地大学排名
    @TableField("US_NEWS_RANK_IDX")
    private int usNewsRankIdx;//USNews内地大学排名
    @TableField("MAJOR_TYPE")
    private int  majorType;//专业类型
    @TableField("HAS_POSTGRADUATE")
    private boolean hasPostgraduate;//是否有研究生院
    @TableField("WENLI")
    private int wenli;//文理科

    private String[] tagsArray;//标签数组
}
