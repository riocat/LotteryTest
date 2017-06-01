package com.yang.lotterytest.Dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yang.lotterytest.Dao.LotteryDao;
import com.yang.lotterytest.Entity.Lottery;

@Repository
public class LotteryDaoImpl implements LotteryDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<Lottery> showLotterys() {
        return sqlSession.selectList("showLotterys");
    }

}
