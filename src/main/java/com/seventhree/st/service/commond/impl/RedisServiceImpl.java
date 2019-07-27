package com.seventhree.st.service.commond.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.seventhree.st.model.User;
import com.seventhree.st.model.commond.UserToken;
import com.seventhree.st.service.UserService;
import com.seventhree.st.service.commond.RedisService;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate<String, String> redis;



    @Override
    public UserToken createToken(User user) {


        //        String token = UUID.randomUUID().toString().replace("-", "");
        String token = getToken(user);
        UserToken userToken = new UserToken();

        userToken.setUserId(user.getUserId());
        userToken.setToken(token);
//        存储到redis并设置过期时间
        redis.boundValueOps(user.getUserId().toString()).set(token,72, TimeUnit.HOURS);
        return userToken;
    }

    @Override
    public UserToken getToken(Integer userId) {
        UserToken userToken = new UserToken();
        boolean exists=redis.hasKey(userId.toString());
        if(exists){
        String token = redis.opsForValue().get(userId.toString());
        userToken.setUserId(userId);
        userToken.setToken(token);
        }
        return userToken;
    }

    public String getToken(User user) {
        String token="";
        String uuid = UUID.randomUUID().toString().replace("-", "");
        try {
            token= JWT.create().withAudience(user.getUserId().toString())
                    .sign(Algorithm.HMAC256(uuid));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return token;
    }
}
