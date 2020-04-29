package com.kyo.schoolweb.service;

import com.kyo.schoolweb.form.UserLoginForm;
import com.kyo.schoolweb.form.UserRegisterForm;
import com.kyo.schoolweb.vo.ResponseResult;

public interface UserService {

    public ResponseResult login(UserLoginForm userLoginForm);

    public ResponseResult register(UserRegisterForm userRegisterForm);


}
