package com.zytb999.aspira.redis.service.impl;

import com.alibaba.fastjson.JSON;
import com.zytb999.aspira.domian.User;
import com.zytb999.aspira.domian.UserAccount;
import com.zytb999.aspira.redis.service.IUserAccountRedisService;
import com.zytb999.aspira.redis.service.IUserRedisService;
import com.zytb999.aspira.redis.util.RedisKeys;
import com.zytb999.aspira.util.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

@Service
@Transactional
public class UserAccountRedisServiceImpl implements IUserAccountRedisService {
    @Autowired
    private StringRedisTemplate template;


    /**
     * 设置登录token值
     *
     * @param userAccount
     * @return
     */
    @Override
    public void setToken(String token, UserAccount userAccount) {
        String key= RedisKeys.USER_LOGIN_TOKEN.join(token);
        //把对象转换为json格式的
        String value = JSON.toJSONString(userAccount);
        //将token缓存到redis中
        template.opsForValue().set(key,value,Consts.USER_INFO_TOKEN_VAI_TIME*60,TimeUnit.SECONDS);
        System.out.println(template.getExpire(key));
    }
    @Override
    public void
    sendVerifyCode(String phone, String code) {
        String key= RedisKeys.VERIFY_CODE.join(phone);
        //第一个参数是Key,第二个参数是value,第三个参数是有效时间,第四个是时间单位;
        template.opsForValue().set(key,code, Consts.VERIFY_CODE_VAI_TIME*60, TimeUnit.SECONDS);
        System.out.println(template.getExpire(key));
    }

    @Override
    public String getVerifyCode(String phone) {
        String key= RedisKeys.VERIFY_CODE.join(phone);
        return template.opsForValue().get(key);
    }

    @Override
    public User getUserByToken(String token) {
        if(!StringUtils.hasLength(token)){
            return null;
        }
        String key= RedisKeys.USER_LOGIN_TOKEN.join(token);
        if(template.hasKey(key)){
            //获取用户
            String userStr  = template.opsForValue().get(key);
            User userByToken= JSON.parseObject(userStr,User.class);
            //重置token有效时间
            template.expire(key,RedisKeys.USER_LOGIN_TOKEN.getTime(),TimeUnit.SECONDS);
            return userByToken;
        }
        return null;
    }

    @Override
    public String getUserByToken1(String phone) {
        if(!StringUtils.hasLength(phone)){
            return "可以正常登入";
        }
        if(template.hasKey(phone)){
            //获取标识
            String token1  = template.opsForValue().get(phone);
            //根据标识获取登入时的key
            String key= RedisKeys.USER_LOGIN_TOKEN.join(token1);
            //删除这个标识对应的token
            template.delete(key);
            return "挤下另一边，可以登入";
        }
        return null;
    }

}

