package com.zytb999.aspira.util;

import com.zytb999.aspira.domian.User;
import com.zytb999.aspira.redis.service.IUserAccountRedisService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 判断token是否失效
 */
public class TokenUtil {
    @Autowired
    private IUserAccountRedisService userAccountRedisService;
    public  User tokenUtil(String token) {
        try {
            User user=userAccountRedisService.getUserByToken(token);
            return user;
        }catch (NullPointerException e){
            return null;
        }
    }
}
