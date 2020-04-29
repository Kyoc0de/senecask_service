package com.kyo.schoolweb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menus {

    private int id;

    private String authName;

    private String path;

    private List<Menus> children;
}
