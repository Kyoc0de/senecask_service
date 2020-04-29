package com.kyo.schoolweb.vo;

import com.kyo.schoolweb.bean.Course;
import com.kyo.schoolweb.bean.CourseComment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseInfo {

    private Course course;

    private List<CourseComment> courseComments;

}
