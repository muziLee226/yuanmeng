package com.zytb999.aspira.domian;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *  测录取概率接口的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdmissionProbability implements Serializable {

    // 批次
    private String batch;

    // 学校的名称
    private String schName;

    // 学校的省份
    private String schProvince;

    // 用户所在省份
    private String province;

    // 老高考文理科
    private Integer subType;

    // 用户总成绩
    private Integer grade;

    // 新高考首选科目,物理或历史
    private String subFir;


}
