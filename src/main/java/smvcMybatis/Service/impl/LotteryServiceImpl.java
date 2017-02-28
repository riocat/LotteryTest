package smvcMybatis.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smvcMybatis.Dao.LotteryDao;
import smvcMybatis.Entity.Lottery;
import smvcMybatis.Service.LotteryService;

@Service
public class LotteryServiceImpl implements LotteryService {

	@Autowired
	private LotteryDao lotteryDao;

	public List<Lottery> showLotterys() {
		return lotteryDao.showLotterys();
	}
}
