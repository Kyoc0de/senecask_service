package com.kyo.schoolweb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private int id;

    private String questionName;

    private String desc;

    private String courseId;

    private String professor;

    private String semester;

    private Boolean mg_state;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;
}
