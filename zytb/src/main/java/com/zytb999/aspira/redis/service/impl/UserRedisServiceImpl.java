package com.zytb999.aspira.redis.service.impl;

import com.alibaba.fastjson.JSON;
import com.zytb999.aspira.domian.User;
import com.zytb999.aspira.domian.UserAccount;
import com.zytb999.aspira.domian.UserRights;
import com.zytb999.aspira.redis.service.IUserRedisService;
import com.zytb999.aspira.redis.util.RedisKeys;
import com.zytb999.aspira.util.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
@Transactional
public class UserRedisServiceImpl implements IUserRedisService {
    @Autowired
    private StringRedisTemplate template;


    /**
     * 设置登录token值
     *
     * @param user
     * @return
     */
    @Override
    public void setToken(String token, User user) {

        String key= RedisKeys.USER_LOGIN_TOKEN.join(token);
        //把对象转换为json格式的
        String value = JSON.toJSONString(user);
        //将token缓存到redis中
        template.opsForValue().set(key,value,Consts.USER_INFO_TOKEN_VAI_TIME*60,TimeUnit.SECONDS);
    }
    @Override
    public void
    sendVerifyCode(String phone, String code) {
        String key= RedisKeys.VERIFY_CODE.join(phone);
        //第一个参数是Key,第二个参数是value,第三个参数是有效时间,第四个是时间单位;
        template.opsForValue().set(key,code, Consts.VERIFY_CODE_VAI_TIME*60, TimeUnit.SECONDS);
    }

    @Override
    public String getVerifyCode(String phone) {
        String key= RedisKeys.VERIFY_CODE.join(phone);
        return template.opsForValue().get(key);
    }

    @Override
    public void setToken1(String phone, String token) {
        template.opsForValue().set(phone,token);
    }

}

