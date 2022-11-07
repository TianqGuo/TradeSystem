package com.tianquan.trade.goods.service.impl;

import com.tianquan.trade.goods.db.dao.GoodsDao;
import com.tianquan.trade.goods.db.model.Goods;
import com.tianquan.trade.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public boolean insertGoods(Goods goods) {
        return goodsDao.insertGoods(goods);
    }

    @Override
    public Goods queryGoodsById(long id) {
        return goodsDao.queryGoodsById(id);
    }


}

