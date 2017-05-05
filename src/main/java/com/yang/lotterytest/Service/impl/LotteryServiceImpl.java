package com.yang.lotterytest.Service.impl;

import java.util.List;

import com.yang.lotterytest.Entity.Lottery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.lotterytest.Dao.LotteryDao;
import com.yang.lotterytest.Service.LotteryService;

@Service
public class LotteryServiceImpl implements LotteryService {

	@Autowired
	private LotteryDao lotteryDao;

	public List<Lottery> showLotterys() {
		return lotteryDao.showLotterys();
	}
}
