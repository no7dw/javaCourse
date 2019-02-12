package com.demo.cache.redis;

import com.demo.cache.redis.CacheVO.UserVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(RedisApplication.class)
public class RedisApplicationTests {

    @Autowired
    private RedisTemplate<String, UserVO> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testObjRedis() {
        UserVO userVO = new UserVO("123", "Wade");
        redisTemplate.opsForValue().set(userVO.getId(), userVO);
        Assert.assertEquals("Wade", redisTemplate.opsForValue().get("123").getName() );
    }
    @Test
    public void testStrRedis() {
        stringRedisTemplate.opsForValue().set("1234", "test str" );
        Assert.assertEquals("test str" , stringRedisTemplate.opsForValue().get("1234"));
    }

}

