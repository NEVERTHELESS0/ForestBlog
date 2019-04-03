package com.liuyanzhao.blog.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisTest {
    public static void main(String[] args) {

        String ADDR = "47.112.25.38";
        int PORT = 6379;
        String AUTH = "123456";
        int MAX_ACTIVE = 1024;
        int MAX_IDLE = 200;
        int MAX_WAIT = 10000;
        int TIMEOUT = 10000;
        boolean TEST_ON_BORROW = true;
        JedisPool jedisPool = null;
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWaitMillis(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT,AUTH);

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                System.out.println("成功");
            } else {
                System.out.println("shibai");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
