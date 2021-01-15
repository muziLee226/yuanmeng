package com.zytb999.aspira.util;

import java.util.Random;

/**
 * 六位随机验证码
 */
public class CodeUtil {
    public static String getCheckCode() {
        String ZiMu = "1234567890";
        String result = "";
        Random random = new Random();
        for (int i = 0; i<6; i++) {
            int index = random.nextInt(ZiMu.length());
            char c = ZiMu.charAt(index);
            result += c;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(getCheckCode());
    }
}
