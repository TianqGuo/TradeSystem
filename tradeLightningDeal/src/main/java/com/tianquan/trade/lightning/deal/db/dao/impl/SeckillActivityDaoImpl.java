package com.tianquan.trade.lightning.deal.db.dao.impl;

import com.tianquan.trade.lightning.deal.db.dao.SeckillActivityDao;
import com.tianquan.trade.lightning.deal.db.mappers.SeckillActivityMapper;
import com.tianquan.trade.lightning.deal.db.model.SeckillActivity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SeckillActivityDaoImpl implements SeckillActivityDao {

    @Autowired
    private SeckillActivityMapper seckillActivityMapper;

    @Override
    public boolean insertSeckillActivity(SeckillActivity seckillActivity) {
        int result = seckillActivityMapper.insert(seckillActivity);
        //大于0 表示插入成功
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public SeckillActivity querySeckillActivityById(long id) {
        return seckillActivityMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public List<SeckillActivity> queryActivitysByStatus(int status) {
//        return seckillActivityMapper.queryActivitysByStatus(status);
//    }

}