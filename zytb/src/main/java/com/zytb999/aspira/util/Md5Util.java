package com.zytb999.aspira.util;

import org.springframework.util.DigestUtils;

public class Md5Util {

        //加入一个盐值，用户混淆
        private final static String salt = "sdaf6546y65l;uq234o;i";

        public static String getMd5(String message){
            String base = message + "/" + salt;
            String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
            return md5;
        }

        //MD5:123:81706c17e36cf8467a31e2af1a9c6bbd
        public static void main(String[] args) {
            System.out.println(getMd5("123"));
        }
    }

