package com.kyo.schoolweb.vo;

import com.kyo.schoolweb.bean.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questions {

    private int totalpage;

    private int pagenum;

    private List<Question> questions;
}
