package com.kyo.schoolweb.controller;

import com.kyo.schoolweb.form.UserLoginForm;
import com.kyo.schoolweb.form.UserRegisterForm;
import com.kyo.schoolweb.service.UserService;
import com.kyo.schoolweb.vo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody UserLoginForm userLoginForm){
        ResponseResult result = userService.login(userLoginForm);
        return result;
    }

    @PostMapping("/user/register")
    public ResponseResult register(@RequestBody UserRegisterForm userRegisterForm){
        ResponseResult register = userService.register(userRegisterForm);
        return register;
    }
}
