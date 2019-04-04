package com.example.springredis;

import com.example.springredis.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test(){
        stringRedisTemplate.opsForValue().set("aaa", "123");
        Assert.assertEquals("123",stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void testObj() throws InterruptedException {
        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        operations.set("ukey",user);
        operations.set("ukey.f",user,5, TimeUnit.SECONDS);
        Thread.sleep(1000);
        boolean exists=redisTemplate.hasKey("ukey.f");
        if(exists){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
    }
}
