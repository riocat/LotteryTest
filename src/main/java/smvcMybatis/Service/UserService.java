package smvcMybatis.Service;

import smvcMybatis.Entity.User;
import smvcMybatis.vo.UserCondition;

public interface UserService {

	public User getUserByName(String name);
	
	public int regester(UserCondition user) throws Exception;

}
