package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
//各省历年省控线表
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_PROVINCIAL_CONTROLLINE")
public class ProvincialControlLine implements Serializable {
    @TableId(value = "ID")
    private String id;//id
    @TableField("PROVINCE_NAME")
    private String  provinceName;//省名称
    @TableField("PROVINCE_CODE")
    private int provinceCode;//省代码
    @TableField(value = "YEAR")
    private String year;//年份
    @TableField("BATCH")
    private String batch;//批次
    @TableField("CONTROLLINE")
    private int controlLine;//省控线
    @TableField("WENLI")
    private int wenli;//文理科

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getControlLine() {
        return controlLine;
    }

    public void setControlLine(int controlLine) {
        this.controlLine = controlLine;
    }

    public int getWenli() {
        return wenli;
    }

    public void setWenli(int wenli) {
        this.wenli = wenli;
    }
}
