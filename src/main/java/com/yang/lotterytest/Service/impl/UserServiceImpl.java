package com.yang.lotterytest.Service.impl;

import com.yang.lotterytest.Dao.UserDao;
import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.Service.UserService;
import com.yang.lotterytest.vo.UserCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User getUserByName(String name) {
		User user = null;
		user = userDao.getUserByName(name);
		return user;
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=RuntimeException.class)
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int regester(UserCondition user) throws Exception {
		int j = userDao.regester(user);


//		System.out.println(j);
//		throw new RuntimeException();


//		throw new FileNotFoundException();
//		String d = null;
//		System.out.println(d.length());

		return j;
	}

}
