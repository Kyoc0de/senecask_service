package com.kyo.schoolweb.service;

import com.kyo.schoolweb.bean.Course;
import com.kyo.schoolweb.form.CourseInfoForm;
import com.kyo.schoolweb.vo.CourseInfo;
import com.kyo.schoolweb.vo.ResponseResult;

import java.util.List;

public interface CourseService {

    public ResponseResult<List<Course>> getCourseList();

    public ResponseResult<List<Course>> getCourseList(String courseId);

    public ResponseResult<CourseInfo> getCourseInfo(String courseId);

    public ResponseResult<CourseInfo> addCourseInfo(CourseInfoForm courseInfoForm);

}
