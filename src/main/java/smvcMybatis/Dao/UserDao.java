package smvcMybatis.Dao;

import smvcMybatis.Entity.User;
import smvcMybatis.vo.UserCondition;

public interface UserDao {

	public User getUserByName(String name);
	
	public int regester(UserCondition user);
}
