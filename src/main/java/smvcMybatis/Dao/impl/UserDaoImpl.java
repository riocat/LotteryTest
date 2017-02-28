package smvcMybatis.Dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import smvcMybatis.Dao.UserDao;
import smvcMybatis.Entity.User;
import smvcMybatis.vo.UserCondition;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public User getUserByName(String name) {
		return sqlSession.selectOne("getUserByName", name);
	}

	@Override
	public int regester(UserCondition user) {
		return sqlSession.update("regester", user);
	}

}
