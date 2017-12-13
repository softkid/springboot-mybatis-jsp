package com.hwq.service;


import com.hwq.entity.User;

public interface UserCache {

	/**
	 * 查询
	 * 
	 * @param id
	 * @return
	 */
	User selectById(Integer id);

	/**
	 * 更新
	 * 
	 * @param user
	 * @return
	 */
	int updateById(User user);

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	String deleteById(Integer id);
}
