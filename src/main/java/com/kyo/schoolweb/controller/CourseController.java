package com.kyo.schoolweb.controller;

import com.kyo.schoolweb.bean.Course;
import com.kyo.schoolweb.form.CourseInfoForm;
import com.kyo.schoolweb.service.CourseService;
import com.kyo.schoolweb.vo.CourseInfo;
import com.kyo.schoolweb.vo.Meta;
import com.kyo.schoolweb.vo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public ResponseResult<List<Course>> getCourseList(){

        ResponseResult<List<Course>> courseList = courseService.getCourseList();

        return courseList;
    }

    @GetMapping("/course/{id}")
    public ResponseResult getCourseInfo(@PathVariable("id") String id){
        ResponseResult<CourseInfo> courseInfo = courseService.getCourseInfo(id);
        return courseInfo;
    }

    @RequestMapping("/course/add")
    public ResponseResult addCourseInfo(@RequestBody CourseInfoForm courseInfoForm){
        log.info(courseInfoForm.toString());
        ResponseResult<CourseInfo> courseInfoResponseResult = courseService.addCourseInfo(courseInfoForm);
        return courseInfoResponseResult;
    }

    @GetMapping("/courses/{courseId}")
    public ResponseResult findCourse(@PathVariable("courseId") String courseId){
        log.info(courseId);
        log.info("____________________________");
        ResponseResult<List<Course>> courseList = courseService.getCourseList(courseId);
        return courseList;
    }

}
