package com.kyo.schoolweb.service.impl;

import com.kyo.schoolweb.bean.User;
import com.kyo.schoolweb.dao.UserDAO;
import com.kyo.schoolweb.enums.StatusCodeEnums;
import com.kyo.schoolweb.form.UserLoginForm;
import com.kyo.schoolweb.form.UserRegisterForm;
import com.kyo.schoolweb.service.UserService;
import com.kyo.schoolweb.utils.TokenUtils;
import com.kyo.schoolweb.vo.Meta;
import com.kyo.schoolweb.vo.ResponseResult;
import com.kyo.schoolweb.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public ResponseResult login(UserLoginForm userLoginForm) {
        String username = userLoginForm.getUsername();
        User user = userDAO.findUserByUsername(username);
        String password = user.getPassword();
        UserVo userVo = new UserVo();
        userVo.setToken(TokenUtils.getToken1());
        Meta meta = new Meta();
        if(!password.equals(userLoginForm.getPassword())){
            meta.setMsg("用户名或密码有误");
            meta.setStatus(StatusCodeEnums.OK.getCode());
            return new ResponseResult(userVo,meta);
        }
        BeanUtils.copyProperties(user,userVo);
        meta.setMsg("登录成功");
        meta.setStatus(StatusCodeEnums.OK.getCode());
        return new ResponseResult<UserVo>(userVo,meta);
    }

    @Override
    public ResponseResult register(UserRegisterForm userRegisterForm) {
        String username = userRegisterForm.getUsername();
        User userByUsername = userDAO.findUserByUsername(username);
        if(userByUsername!= null){
            UserVo userVo = new UserVo();
            Meta meta = new Meta("用户名已存在", 201);
            ResponseResult<UserVo> userVoResponseResult = new ResponseResult<>(userVo, meta);
            return userVoResponseResult;
        }
        User user = new User();
        BeanUtils.copyProperties(userRegisterForm,user);
        User saveUser = userDAO.save(user);
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(saveUser,userVo);
        userVo.setToken(TokenUtils.getToken1());
        Meta meta = new Meta("注册成功", StatusCodeEnums.OK.getCode());
        ResponseResult<UserVo> userVoResponseResult = new ResponseResult<>(userVo, meta);
        return userVoResponseResult;
    }
}
