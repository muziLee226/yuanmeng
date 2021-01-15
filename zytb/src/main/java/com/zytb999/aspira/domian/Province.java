package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_PROVINCES")
public class Province {
    @TableId(value = "ID")
    private String id;
    @TableField("PRO_NAME")
    private String proName;//省名称;北京市
    @TableField("PRO_CODE")
    private String proCode;//省行政编号；110000
    @TableField("CITY_NAME")
    private String cityName;//市名称;北京市
    @TableField("CITY_CODE")
    private String cityCode;//市行政编号:
    @TableField("AREA_NAME")
    private String areaName;//县/区名称:东城区
    @TableField("AREA_CODE")
    private String areaCode;//县/区行政编号；110101
}
