package com.yang.lotterytest.Dao;

import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.vo.UserCondition;

public interface UserDao {

	public User getUserByName(String name);
	
	public int regester(UserCondition user);
}
