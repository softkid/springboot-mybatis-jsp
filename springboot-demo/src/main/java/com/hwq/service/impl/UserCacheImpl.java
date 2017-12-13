package com.hwq.service.impl;

import com.hwq.service.UserCache;
import com.hwq.dao.UserMapper;
import com.hwq.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@CacheConfig(cacheNames = "userCache")
@Service
public class UserCacheImpl implements UserCache {

	@Autowired
	private UserMapper userMapper;

	@Cacheable(key = "#p0")
	@Override
	public User selectById(Integer id) {
		System.out.println("查询功能，缓存找不到，直接读库, id=" + id);
		return userMapper.findOne(id);
	}

	@CachePut(key = "#p0")
	@Override
	public int updateById(User user) {
		System.out.println("更新功能，更新缓存，直接写库, id=" + user);
		return userMapper.save(user);
	}

	@CacheEvict(key = "#p0")
	@Override
	public String deleteById(Integer id) {
		System.out.println("删除功能，删除缓存，直接写库, id=" + id);
		return "清空缓存成功";
	}

}
