package com.kyo.schoolweb.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseInfoForm {

    private String courseId;

    private String courseProf;

    private String semester;

    private int rate;

    private String comment;

}
