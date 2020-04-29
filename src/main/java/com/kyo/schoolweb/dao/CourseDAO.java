package com.kyo.schoolweb.dao;

import com.kyo.schoolweb.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDAO extends JpaRepository<Course,Long> {

    public Course findCourseByCourseId(String courseId);

}
