package jedis_;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("hadoop100", 6379);
        System.out.println(jedis.ping());
        jedis.close();
    }

    @Test
    public void t1() {
        Jedis jedis = new Jedis("hadoop100", 6379);
        jedis.set("k1", "v1");
        jedis.mset("k2", "v2", "k3", "v3");
        //获取所有key的值
        Set<String> keys = jedis.keys("*");
        System.out.println(keys.size());
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println(jedis.exists("k1"));
        System.out.println(jedis.ttl("k1"));
        System.out.println(jedis.get("k1"));
        jedis.close();
    }

    //操作list
    @Test
    public void t2() {
        Jedis jedis = new Jedis("hadoop100", 6379);
        jedis.lpush("name", "z1", "z2", "z3");
        List<String> name = jedis.lrange("name", 0, -1);
        System.out.println(name);
        jedis.close();
    }

    //操作set
    @Test
    public void t3() {
        Jedis jedis = new Jedis("hadoop100", 6379);
        jedis.sadd("names", "z1", "z2", "z3", "z3");
        Set<String> names = jedis.smembers("names");
        System.out.println(names);
        //删除set中值
        jedis.srem("names", "z1");
        names = jedis.smembers("names");
        System.out.println(names);
        jedis.close();
    }

    //操作hash
    @Test
    public void t4() {
        Jedis jedis = new Jedis("hadoop100", 6379);
        jedis.hset("users", "name", "张三");
        jedis.hset("users", "age", "18");
        System.out.println(jedis.hget("users", "name"));
        System.out.println(jedis.hget("users", "age"));
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "李四");
        map.put("age", "20");
        jedis.hset("users", map);
        List<String> result = jedis.hmget("users", "name", "age");
        System.out.println(result);
        jedis.close();
    }

    //操作zset
    @Test
    public void t5() {
        Jedis jedis = new Jedis("hadoop100", 6379);
        jedis.zadd("address", 100, "上海");
        jedis.zadd("address", 200, "北京");
        jedis.zadd("address", 300, "南昌");
        jedis.zadd("address", 400, "吉安");
        Set<String> address = jedis.zrange("address", 0, -1);
        System.out.println(address);
        jedis.close();
    }
}
