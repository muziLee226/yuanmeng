package com.zytb999.aspira.exception;

/**
 * 自定义逻辑异常类
 * 对用户显示的异常管理:业务级异常
 */

public class LogicException extends RuntimeException{

    public LogicException(String msg){
        super(msg);
    }
}
