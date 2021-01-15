package com.zytb999.aspira.domian;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UniRank implements Serializable {
    private String rankId;
    private String rankNum;
}
