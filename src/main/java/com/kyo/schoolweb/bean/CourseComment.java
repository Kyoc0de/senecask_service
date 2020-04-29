package com.kyo.schoolweb.bean;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class CourseComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String courseId;

    private String courseProf;

    private String semester;

    private int rate;

    private String comment;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;

    private Date deleteTime;

}
