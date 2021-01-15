package com.zytb999.aspira.domian;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SchRecom implements Serializable {
    private String id;
    private String schIcon;//推荐学校的图标
    private String schName;//推荐学校的名称
    private int schType;//推荐学校的类型
    private String TAGS;
}
