package smvcMybatis.Service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import smvcMybatis.Dao.UserDao;
import smvcMybatis.Entity.User;
import smvcMybatis.Service.UserService;
import smvcMybatis.vo.UserCondition;

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
