package com.zytb999.aspira.domian.dto;

import lombok.Data;

@Data
public class PayDto {
    //订单编号
    private String id;

    //private String state;

    //private String createTime;
    //订单金额
    private String tradeAmount;
    //订单名称
//    private String name;
    //1 标准卡2高级卡 3旗舰卡
    private Integer vipLevel;

    private String vipCardId;
    //商品描述
    private String tradeSummary;

}
