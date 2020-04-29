package com.kyo.schoolweb.controller;

import com.kyo.schoolweb.bean.Question;
import com.kyo.schoolweb.vo.Meta;
import com.kyo.schoolweb.vo.Questions;
import com.kyo.schoolweb.vo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
@Slf4j
@RequestMapping("/api/v1")
public class QuestionController {

    @GetMapping("/questions")
    public ResponseResult<Questions> getQuestionsList(@RequestParam(value = "query",required = false) String query,
                                                      @RequestParam(value = "pagenum",required = false) String pagenum,
                                                      @RequestParam(value = "pagesize",required = false) String pagesize
                                           ){
        log.info("访问-----------------------------------");

        Meta meta = new Meta("获取成功", 200);

        Questions questions = new Questions();
        questions.setPagenum(1);
        questions.setTotalpage(1);

        Question question = new Question();
        question.setId(1);
        question.setQuestionName("测试问题");
        question.setDesc("随便问点什么做测试");
        question.setProfessor("fail狂魔");
        question.setSemester("winter2020");
        question.setMg_state(true);


        ArrayList<Question> list = new ArrayList<>();
        list.add(question);
        questions.setQuestions(list);
        ResponseResult<Questions> objectResponseResult = new ResponseResult<Questions>(questions,meta);


        return objectResponseResult;
    }

}
