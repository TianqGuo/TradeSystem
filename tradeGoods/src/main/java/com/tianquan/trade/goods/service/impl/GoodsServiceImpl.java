package com.tianquan.trade.goods.service.impl;

import com.tianquan.trade.goods.db.dao.GoodsDao;
import com.tianquan.trade.goods.db.model.Goods;
import com.tianquan.trade.goods.service.GoodsService;
import com.tianquan.trade.goods.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private SearchService searchService;

    @Override
    public boolean insertGoods(Goods goods) {
        boolean res = goodsDao.insertGoods(goods);
        //添加商品到ES中
        searchService.addGoodsToES(goods);
        return res;
    }

    @Override
    public Goods queryGoodsById(long id) {
        return goodsDao.queryGoodsById(id);
    }

    @Override
    public boolean lockStock(long id) {
        return goodsDao.lockStock(id);
    }

    @Override
    public boolean deductStock(long id) {
        return goodsDao.deductStock(id);
    }

    @Override
    public boolean revertStock(long id) {
        return goodsDao.revertStock(id);
    }

}

