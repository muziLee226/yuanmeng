package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;
import java.util.Map;

//大学排行榜
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("T_SCHOOL_RANK")
public class SchoolRank {
    @TableId(value = "ID")
    private String id;//id
    @TableField(value = "YEAR")
    private int year;
    @TableField(value = "RANK_NAME")
    private String rankName;//大学排名的名称
    @TableField(value = "SCHOOL_RANK")
    @JsonIgnore
    private String schoolRank;//大学排名
    @TableField(value = "INTRO")
    private String intro;

    private List<Map> schoolList;
}
