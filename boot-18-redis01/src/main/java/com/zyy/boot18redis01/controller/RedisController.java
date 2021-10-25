package com.zyy.boot18redis01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 花间影
 * 14:44
 **/
@RestController
public class RedisController   {

    //创建模板
    @Resource
    private RedisTemplate redisTemplate;

    /*
    * 序列化方式为string的模板 */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/redis/{k}/{v}")
    public String postRedis(@PathVariable String k,@PathVariable String v){

        redisTemplate.opsForValue().set(k, v);

        return "创建string类型的键:k="+k+";值v="+v;
    }

    @GetMapping("/redis/{k}")
    public String getRedis(@PathVariable String k){

        String str = (String) redisTemplate.opsForValue().get(k);
        return str;
    }

    //设置序列化的方式
    @PostMapping("/serializable/{k}/{v}")
    public String postSerializable(@PathVariable String k,@PathVariable String v){

        //设置序列化方式 键和值可以单独的设置序列化的方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());//设置键的序列化方式
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());//设置值的序列化方式

        redisTemplate.opsForValue().set(k, v);

        return "创建string类型的键:k="+k+";值v="+v;

    }

}
