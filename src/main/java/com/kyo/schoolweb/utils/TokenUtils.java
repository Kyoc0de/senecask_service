package com.kyo.schoolweb.utils;

import java.util.UUID;

public class TokenUtils {

    public static String getToken1(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
