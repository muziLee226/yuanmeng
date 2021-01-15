package com.zytb999.aspira.domian;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MajorClass {
    private String majorcolId;
    private String majorcolName;
    private List<MajorList> majorList;
}
