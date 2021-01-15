package com.zytb999.aspira.advice;

import com.zytb999.aspira.exception.LogicException;
import com.zytb999.aspira.util.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 自定义通用的统一异常处理类
 *
 * ControllerAdvice 是controller类增强注解,动态代理controller类实现额外功能
 * 1.请求进入controller映射方法之前做增强:如日期格式化
 * 2.请求进入controller映射方法之后做增强:统一异常处理
 */
@ControllerAdvice
public class CommonExceptionHandler {

    //指定处理异常的类型(用户级别异常)
    //方法定义与映射方法相同
    @ExceptionHandler(LogicException.class)
    @ResponseBody
    public Object logicExp(Exception e, HttpServletResponse resp){
        e.printStackTrace();
        resp.setContentType("application/json;charset=utf-8");
        return JsonResult.error(JsonResult.CODE_ERROR_PARAM,e.getMessage(),null);
    }

    //指定处理系统异常类(代码异常类,后台异常)
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Object runTimeExp(Exception e, HttpServletResponse resp){
        e.printStackTrace();
        resp.setContentType("application/json;charset=utf-8");
       return JsonResult.defaultError();
    }
}
