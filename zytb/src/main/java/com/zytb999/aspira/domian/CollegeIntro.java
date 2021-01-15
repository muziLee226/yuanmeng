package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

//学校部分详细信息
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CollegeIntro implements Serializable {
    private int enrollPlan;//计划招生数
    private int min;//最低分
    private int minRank;//最低位次
    private  double forwScore;//预估分
}
