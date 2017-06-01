package com.yang.lotterytest.Service;

import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.vo.UserCondition;

public interface UserService {

	public User getUserByName(String name);
	
	public int regester(UserCondition user) throws Exception;

}
