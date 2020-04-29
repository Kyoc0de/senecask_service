package com.kyo.schoolweb.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 32)
    private String username;
    @Column(length = 32)
    private String password;
    @Column(length = 32)
    private String nickname;
    @Column(length = 32)
    private String email;

    private Date createTime;

    private Date updateTime;

}
