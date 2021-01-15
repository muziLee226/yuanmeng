package com.zytb999.aspira.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

//个人收藏列表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_COLLECTORS")
public class Collectors implements Serializable {
    @TableId(value = "ID")
    private String id;//id

    @TableField("COLLECT_TIME")
    private Date collecTime;//收藏时间
    @TableField("USER_USER_ID")
    private String userUserId;
    @TableField("CEEDATA_ID")
    private String ceedataId;
    @TableField("STATE")
    private int state;//收藏状态
}
