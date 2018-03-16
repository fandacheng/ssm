package com.wk.dao;

import com.wk.domain.User;

public interface UserDao {
	public abstract User findByUsername(String username);
}
