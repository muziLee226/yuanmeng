package com.zytb999.aspira.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * jsonResult
 *
 * {
 *     code:
 *     msg:
 *     data:[]
 * }
 */
@Setter
@Getter
@NoArgsConstructor
public class JsonResult<T> {

    public static final int CODE_SUCCESS = 2020200;
    public static final String MSG_SUCCESS = "操作成功";
    public static final int CODE_NOLOGIN = 2020401;
    public static final String MSG_NOLOGIN = "请先登录";

    public static final int CODE_ERROR = 2020500;
    public static final String MSG_ERROR = "系统异常，请联系管理员";

    public static final int CODE_ERROR_PARAM = 2020501;  //参数异常

    private int code;  //区分不同结果, 而不再是true或者false
    private String msg;
    private Object data;  //除了操作结果之后, 还行携带数据返回
    public JsonResult(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static <Object> JsonResult success(Object data){
        return new JsonResult(CODE_SUCCESS, MSG_SUCCESS, data);
    }

    public static JsonResult success(){
        return new JsonResult(CODE_SUCCESS, MSG_SUCCESS, null);
    }

    public static <Object>  JsonResult error(int code, String msg, java.lang.Object data){
        return new JsonResult(code, msg, data);
    }

    public static JsonResult defaultError(){
        return new JsonResult(CODE_ERROR, MSG_ERROR, null);
    }


    public static JsonResult noLogin() {
        return new JsonResult(CODE_NOLOGIN, MSG_NOLOGIN, null);
    }
}
