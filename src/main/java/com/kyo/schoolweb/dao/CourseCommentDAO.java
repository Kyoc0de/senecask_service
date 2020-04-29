package com.kyo.schoolweb.dao;

import com.kyo.schoolweb.bean.CourseComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseCommentDAO extends JpaRepository<CourseComment, Long> {

    public List<CourseComment> findAllByCourseId(String courseId);
}
