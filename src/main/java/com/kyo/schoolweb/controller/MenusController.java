package com.kyo.schoolweb.controller;

import com.kyo.schoolweb.vo.Menus;
import com.kyo.schoolweb.vo.Meta;
import com.kyo.schoolweb.vo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class MenusController {

    @GetMapping("/menus")
    public ResponseResult getMenus(){
        ResponseResult<Object> objectResponseResult = new ResponseResult<>();
        Meta meta = new Meta("获取菜单列表成功", 200);

        Menus menus2 = new Menus();
        menus2.setId(104);
        menus2.setAuthName("课业问答");
        menus2.setPath("ask");
        menus2.setChildren(null);
        List<Menus> menusList = new ArrayList<>();
        menusList.add(menus2);

        Menus menus1 = new Menus();
        menus1.setId(101);
        menus1.setAuthName("问答系统");
        menus1.setPath(null);
        menus1.setChildren(menusList);

        List<Menus> menusList1 = new ArrayList<>();
        menusList1.add(menus1);


//        ---------------------------------

//        Menus menus31 = new Menus();
//        menus31.setId(211);
//        menus31.setAuthName("自习室");
//        menus31.setPath("online");
//        menus31.setChildren(null);
//        List<Menus> menusList3 = new ArrayList<>();
//        menusList3.add(menus31);

//        Menus menus3 = new Menus();
//        menus3.setId(201);
//        menus3.setAuthName("在线自习");
//        menus3.setPath(null);
//        menus3.setChildren(menusList3);
//
//        menusList1.add(menus3);

//        -----------------------------------
//
//        Menus menus41 = new Menus();
//        menus41.setId(311);
//        menus41.setAuthName("二手教材");
//        menus41.setPath("book");
//        menus41.setChildren(null);
        List<Menus> menusList4 = new ArrayList<>();
//        menusList4.add(menus41);

        Menus menus42 = new Menus();
        menus42.setId(312);
        menus42.setAuthName("课程介绍");
        menus42.setPath("course");
        menus42.setChildren(null);
//        List<Menus> menusList4 = new ArrayList<>();
        menusList4.add(menus42);

        Menus menus4 = new Menus();
        menus4.setId(401);
        menus4.setAuthName("选课帮助");
        menus4.setPath(null);
        menus4.setChildren(menusList4);

        menusList1.add(menus4);



        objectResponseResult.setData(menusList1);
        objectResponseResult.setMeta(meta);
        return objectResponseResult;
    }
}
