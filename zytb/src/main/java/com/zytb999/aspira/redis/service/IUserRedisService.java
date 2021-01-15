package com.zytb999.aspira.redis.service;

import com.zytb999.aspira.domian.User;
import com.zytb999.aspira.domian.UserAccount;
import com.zytb999.aspira.domian.UserRights;

/**
 * 用户redis缓存操作接口
 */
public interface IUserRedisService {
    /**
     *  设置token令牌,进行登录操作
     * @param user
     * @return
     */
    void setToken(String token, User user);
    /**
     * 缓存注册码的校验
     * @param phone
     * @param code
     */
    void sendVerifyCode(String phone, String code);
    /**
     * 根据手机号获取缓存中的验证码
     * @param phone
     * @return
     */
    String getVerifyCode(String phone);

    /**
     * 创建登入标识
     * @param phone
     * @param token
     */
    void setToken1(String phone, String token);
}
