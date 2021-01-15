package com.zytb999.aspira.util;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Jsontojava {
    public static String[] toArray(String s) {
        List<String> list = JSON.parseArray(s, String.class);
        String[] Strings=new String[list.size()];
        String[] array = list.toArray(Strings);
        return array;
    }
}
