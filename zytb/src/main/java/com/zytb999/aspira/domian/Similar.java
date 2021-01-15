package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

//相似专业
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Similar implements Serializable {
    private String majId;
    private String majName;
}
