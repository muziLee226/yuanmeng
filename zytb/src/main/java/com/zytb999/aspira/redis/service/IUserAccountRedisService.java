package com.zytb999.aspira.redis.service;

import com.zytb999.aspira.domian.User;
import com.zytb999.aspira.domian.UserAccount;

/**
 * 用户redis缓存操作接口
 */
public interface IUserAccountRedisService {
    /**
     *  设置token令牌,进行登录操作
     * @param userAccount
     * @return
     */
    void setToken(String token, UserAccount userAccount);
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
     * 通过token获取当前用户对象
     * @param token
     * @return
     */
    User getUserByToken(String token);

    /**
     * 通过phone获取token1标识
     * @param phone
     * @return
     */
    String getUserByToken1(String phone);
}
