package org.sang;


import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class JR {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.112.128",6379);
        jedis.auth("123@456"); //输入redis密码
        System.out.println("连接成功");

        //查看服务是否运行
        System.out.println("服务正在运行：" + jedis.ping());
    }

    @Test
    public void test1(){
        Jedis jedis = new Jedis("192.168.0.101",22);
        jedis.auth("123@456"); //输入redis密码
        System.out.println("连接成功");

        //查看服务是否运行
        System.out.println("服务正在运行：" + jedis.ping());
    }
}
