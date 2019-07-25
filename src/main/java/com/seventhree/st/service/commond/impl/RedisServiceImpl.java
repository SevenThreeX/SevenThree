package com.seventhree.st.service.commond.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.seventhree.st.model.User;
import com.seventhree.st.model.commond.UserToken;
import com.seventhree.st.service.commond.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class RedisServiceImpl implements RedisService {


    private RedisTemplate<Integer, String> redis;

    @Autowired
    @Qualifier("redisTemplate")
    public void setRedis(RedisTemplate redis) {
        this.redis = redis;
//        泛型设置成Long后必须更改对应的序列化方案
        redis.setKeySerializer(new JdkSerializationRedisSerializer());
    }
    @Override
    public UserToken createToken(User user) {
//        String token = UUID.randomUUID().toString().replace("-", "");
        String token = getToken(user);
        UserToken userToken = new UserToken();

        userToken.setUserId(user.getUserId());
        userToken.setToken(token);
//        存储到redis并设置过期时间
        redis.boundValueOps(user.getUserId()).set(token,72, TimeUnit.HOURS);
        return userToken;
    }

    @Override
    public UserToken getToken(Integer userId) {
        UserToken userToken = new UserToken();
        boolean exists=redis.hasKey(userId);
        if(exists){
        String token = redis.opsForValue().get(userId);
        userToken.setUserId(userId);
        userToken.setToken(token);
        }
        return userToken;
    }

    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getUserId().toString())
                .sign(Algorithm.HMAC256(user.getPassWord()));
        return token;
    }
}
