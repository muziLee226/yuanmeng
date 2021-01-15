package com.zytb999.aspira.redis.util;

import com.zytb999.aspira.util.Consts;
import lombok.Getter;

/**
 * redis的key管理工具类
 *
 * 特性:一个枚举实例代表一个key
 *
 */
@Getter
public enum RedisKeys {
    //创建用户登录的key
    //切换大小写:ctrl + shift + u
    USER_LOGIN_TOKEN("user_login_token", Consts.USER_INFO_TOKEN_VAI_TIME *60L),

    //短信验证码的key
    //参数一为前缀,参数二为超时时间5分钟*60,转换成秒
    VERIFY_CODE("verify_Code", Consts.VERIFY_CODE_VAI_TIME * 60L);

    //key的前缀
    private String prefix;

    //key的有效时间,-1L表示不需要设定过期时间,单位是秒
    private Long time;

    private RedisKeys(String prefix, Long time) {
        this.prefix = prefix;
        this.time = time;
    }

    //用来拼接完整的key(携带可变参数,后期可以添加多个拼接)
    public String join(String... values){
        //创建stringbulider对象
        StringBuilder sb=new StringBuilder(80);
        //拼接key和遍历value
        sb.append(this.prefix);
        for (String value : values) {
            sb.append(":").append(value);
        }
        //返回拼接后的结果
        return sb.toString();
    }

    //测试拼接是否成功
    public static void main(String[] args) {
        System.out.println(RedisKeys.VERIFY_CODE.join("18355193206","aaa","bbb"));
    }

}
