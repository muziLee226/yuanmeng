package com.zytb999.aspira.config.mvc;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZColin
 */
@RestControllerAdvice
public class MvcDataBinderAdvice {

    /**
     * 数据绑定器, 从请求中获取的字符串参数时“2018-09-06 12:24:56”如何绑定为Data类型
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor());
    }


    //自定义的DeteEditor转换
    public static class CustomDateEditor extends PropertyEditorSupport {
        private final DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        private final DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");

        @Override
        public void setAsText(@Nullable String text) throws IllegalArgumentException {
            if (!StringUtils.hasText(text)||text.contains("NaN")) {
                this.setValue(null);
            } else {
                try {
                    this.setValue(this.dateFormat1.parse(text));
                } catch (ParseException var2) {
                    try {
                        this.setValue(this.dateFormat2.parse(text));
                    } catch (ParseException var3) {
                        throw new IllegalArgumentException("Could not parse date: " + var3.getMessage(), var3);
                    }
                }
            }
        }
    }
}
