package com.zytb999.aspira.domian;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.util.Date;
//订单表
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_ORDER")
public class Order {
    @TableId(value = "ID")
    private String id;
    @TableField("STATE")
    private int state;//状态
    @TableField("CREATETIME")
    private Date createTime;//创建时间
    @TableField("PAY_TIME")
    private Date payTime;//支付时间
    @TableField("PAY_WAY")
    private int payWay;//支付方式
    @TableField("TRADE_CODE")
    private String tradeCode;//交易代码
    @TableField("TRADE_SUMMARY")
    private String tradeSummary;//交易说明
    @TableField("TRADE_AMOUNT")
    private double tradeAmount;//交易金额
    @TableField("PRODUCT_ID")
    private String productId;//
    @TableField("USER_ID")
    private String userId;//
}
