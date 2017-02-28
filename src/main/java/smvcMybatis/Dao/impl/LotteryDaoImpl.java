package smvcMybatis.Dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import smvcMybatis.Dao.LotteryDao;
import smvcMybatis.Entity.Lottery;

@Repository
public class LotteryDaoImpl implements LotteryDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Lottery> showLotterys() {
		return sqlSession.selectList("showLotterys");
	}

}
