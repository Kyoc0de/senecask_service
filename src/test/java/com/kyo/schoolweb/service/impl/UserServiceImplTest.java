package com.kyo.schoolweb.service.impl;


import com.kyo.schoolweb.SchoolwebApplication;

import com.kyo.schoolweb.SchoolwebApplicationTests;
import com.kyo.schoolweb.form.UserRegisterForm;
import com.kyo.schoolweb.vo.ResponseResult;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserServiceImplTest extends SchoolwebApplicationTests {

    @Autowired
    private UserServiceImpl userServiceImpl;
    @Test
    public void register() {
        UserRegisterForm userRegisterForm = new UserRegisterForm();
        userRegisterForm.setUsername("jiayuan");
//        userRegisterForm.setNickname("root");
        userRegisterForm.setPassword("root");
//        userRegisterForm.setRePassword("root");
        userRegisterForm.setEmail("ko@qq.com");
        ResponseResult register = userServiceImpl.register(userRegisterForm);
        log.info(register.toString());
    }
}