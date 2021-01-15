package com.zytb999.aspira.config.mybatisPlusConfig;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

//字段自动填充的配置类
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler{
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill....");
        Date now=new Date();
        this.setFieldValByName("createTime",now,metaObject);
        this.setInsertFieldValByName("createTime", now, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        Date now=new Date();
        this.setFieldValByName("updateTime", now, metaObject);
        this.setUpdateFieldValByName("updateTime", now, metaObject);
    }
}
