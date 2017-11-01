package com.asiainfo.webapp.startup.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * 访问Redis的工具类，本类中所有方法均为静态方法，注意通过静态方式调用。<br>
 * template实例通过spring在session.xml中配置，需要在ApplicationContext加载完成后将template实例set至本类<br>
 * 当前提供了最基本的Redis访问命令，如需执行其他Redis命令，请自行实现
 * 
 * @author wukg
 *
 */
public class RedisClient {
	private static StringRedisTemplate template;

	public static void setTemplate(StringRedisTemplate template) {
		RedisClient.template = template;
	}
	
	/**
	 * SET命令
	 * @param key
	 * @param value
	 */
	public static void set(String key, String value) {
		template.opsForValue().set(key, value);
	}

	/**
	 * SETEX命令
	 * @param key
	 * @param value
	 * @param seconds - x秒后过期
	 */
	public static void setEx(String key, String value, long seconds) {
		template.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);
	}
	
	/**
	 * SETNX命令
	 * @param key
	 * @param value
	 * @return
	 */
	public static boolean setNx(String key, String value) {
		return template.opsForValue().setIfAbsent(key, value);
	}
	
	/**
	 * MSET命令
	 * @param map - 需要批量SET的键值对
	 */
	public static void mSet(Map<String, String> map) {
		template.opsForValue().multiSet(map);
	}
	
	/**
	 * EXPIRE命令
	 * @param key
	 * @param seconds - x秒后过期
	 */
	public static void expire(String key, long seconds) {
		template.expire(key, seconds, TimeUnit.SECONDS);
	}
	
	/**
	 * GET命令
	 * @param key
	 * @return
	 */
	public static String get(String key) {
		return template.opsForValue().get(key);
	}
	
	/**
	 * DEL命令
	 * @param key
	 */
	public static void del(String key) {
		template.delete(key);
	}
	
	/**
	 * DEL命令（批量）
	 * @param keys
	 */
	public static void del(Collection<String> keys) {
		template.delete(keys);
	}
	
	/**
	 * INCR命令
	 * @param key
	 * @return
	 */
	public static Long incr(String key) {
		return template.opsForValue().increment(key, 1L);
	}
	
	/**
	 * INCRBY命令
	 * @param key
	 * @param incr - 增量，传-1即可实现DECR
	 * @return
	 */
	public static Long incrBy(String key, long incr) {
		return template.opsForValue().increment(key, incr);
	}
	
	/**
	 * HSET命令
	 * @param key
	 * @param field
	 * @param value
	 */
	public static void hSet(String key, String field, String value) {
		template.opsForHash().put(key, field, value);
	}
	
	/**
	 * HMSET命令
	 * @param key
	 * @param value
	 */
	public static void hmSet(String key, Map<String, String> value) {
		template.opsForHash().putAll(key, value);
	}
	
	/**
	 * HGET命令
	 * @param key
	 * @param field
	 * @return
	 */
	public static String hGet(String key, String field) {
		return String.valueOf(template.opsForHash().get(key, field));
	}
	
	/**
	 * HMGET命令
	 * @param key
	 * @param fields
	 * @return
	 */
	public static List<Object> hmGet(String key, Collection<Object> fields) {
		return template.opsForHash().multiGet(key, fields);
	}
	
	/**
	 * HGETALL命令
	 * @param key
	 * @return
	 */
	public static Map<Object, Object> hGetAll(String key) {
		return template.opsForHash().entries(key);
	}
	
	/**
	 * HINCRBY命令
	 * @param key
	 * @param field
	 * @param incr
	 * @return
	 */
	public static Long hIncrBy(String key, String field, long incr) {
		return template.opsForHash().increment(key, field, incr);
	}
}
