package com.hwq.dao;

import com.hwq.entity.User;

public interface UserMapper {

    User select();

    User findOne(Integer id);

    int save(User user);
}
