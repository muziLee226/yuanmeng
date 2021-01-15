package com.zytb999.aspira.domian.dto;

import lombok.Data;

/**
 * @PROJECT_NAME: youerxuanBackground
 * @DESCRIPTION:
 * @USER: 木子Lee
 * @DATE: 2020/12/17 16:04
 */
@Data
public class MajorDto {

    private String MAJOR_NAME;
    private String  MAJOR_CODE;
    private Integer ADMISSION_COUNT;
    private Integer PLAN_COUNT;
    private String YEAR_READ;
    private String  TUITION;
    private Integer MIN_SCORE;
    private Integer MIN_SCORE_RANK;
    private Integer MAX_SCORE;
    private Integer  MIN_SCORE_DIFF;
    private Integer MAX_SCORE_RANK;
    private Integer MAX_SCORE_DIFF;
    private Integer MAJOR_RANK;
    private String DEPARTMENT;

}
