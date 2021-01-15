package com.zytb999.aspira.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//获取最新年份
public class YearUtil {
    /**
     * 获取年份·
     * @return
     */
    public static String getSysYear() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        return year;
    }
    /**
     * 获取格式化的时间
     * 输出格式：2015-08-04 20:55:35
     */
    public static Date getFormatDate(){
        Date date = new Date();
        long times = date.getTime();//时间戳
        Date time = new Date(times);
        return time;
    }
    /**
     * 获取现在时间
     *
     * @return 返回时间类型 yyyy-MM-dd HH:mm:ss
     */
    public static Date getNowDate() throws ParseException {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        Date dateParse = formatter.parse(dateString);

        return dateParse;

    }
    /**
     * 获取现在时间
     *
     * @return返回字符串格式 yyyyMMddHHmmss
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String all = dateString.replaceAll("[[\\s-:punct:]]", "");
        return all;


    }




    public static String getYearMonth() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        String all = dateString.replaceAll("[[\\s-:punct:]]", "");
        return all;


    }
    public static void main(String[] args) {
        String str = YearUtil.getYearMonth();
        int a = Integer.parseInt(str);
        System.out.println( a);

    }

}
