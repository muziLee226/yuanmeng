package com.zytb999.aspira.domian.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @PROJECT_NAME: youerxuanBackground
 * @DESCRIPTION:
 * @USER: 木子Lee
 * @DATE: 2020/12/16 16:46
 */
@Data
public class OrderFormDto {

    private String id;

    private String orderForm;//志愿表

    private Date orderTime;//志愿生成的时间

    private int isnew;//是否是最新的志愿表

    private String userId;//

    private String batch;

    // 高考类型：0：老高考，1：新高考
    private Integer type;

    // 文理科：0：文科，1：理科
    private Integer wenLi;

    private List<Map> orderFormList;
}
