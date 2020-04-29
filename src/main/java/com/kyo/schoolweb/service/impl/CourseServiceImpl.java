package com.kyo.schoolweb.service.impl;

import com.kyo.schoolweb.bean.Course;
import com.kyo.schoolweb.bean.CourseComment;
import com.kyo.schoolweb.dao.CourseCommentDAO;
import com.kyo.schoolweb.dao.CourseDAO;
import com.kyo.schoolweb.form.CourseInfoForm;
import com.kyo.schoolweb.service.CourseService;
import com.kyo.schoolweb.vo.CourseInfo;
import com.kyo.schoolweb.vo.Meta;
import com.kyo.schoolweb.vo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDAO courseDAO;

    @Autowired
    private CourseCommentDAO courseCommentDAO;

    @Override
    public ResponseResult<List<Course>> getCourseList() {
        List<Course> allCourse = courseDAO.findAll();
        ResponseResult responseResult = new ResponseResult();
        Meta meta = new Meta("获取列表成功", 200);
        responseResult.setData(allCourse);
        responseResult.setMeta(meta);
        return responseResult;
    }

    @Override
    public ResponseResult<List<Course>> getCourseList(String courseId) {
        Course course = courseDAO.findCourseByCourseId(courseId);
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course);
        ResponseResult responseResult = new ResponseResult();
        Meta meta = new Meta("获取列表成功", 200);
        responseResult.setData(courses);
        responseResult.setMeta(meta);
        return responseResult;
    }


    @Override
    public ResponseResult<CourseInfo> getCourseInfo(String courseId) {

        Course course = courseDAO.findCourseByCourseId(courseId);
        List<CourseComment> courseCommentList = courseCommentDAO.findAllByCourseId(courseId);
        CourseInfo courseInfo = new CourseInfo(course, courseCommentList);
        Meta meta = new Meta("成功", 200);
        ResponseResult<CourseInfo> responseResult = new ResponseResult<>(courseInfo, meta);

        return responseResult;
    }

    @Override
    public ResponseResult<CourseInfo> addCourseInfo(CourseInfoForm courseInfoForm) {
        CourseComment courseComment = new CourseComment();
        log.info("--------------元");
        log.info(courseInfoForm.toString());
        BeanUtils.copyProperties(courseInfoForm,courseComment);
        log.info("--------------new");
        log.info(courseComment.toString());
        CourseComment save = courseCommentDAO.save(courseComment);
        Meta meta = new Meta("成功", 200);
        ResponseResult responseResult = new ResponseResult(null, meta);
        return responseResult;
    }
}
