package com.tianquan.trade.goods.db.mappers;

import com.tianquan.trade.goods.db.model.Goods;

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Nov 06 10:29:09 PST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Nov 06 10:29:09 PST 2022
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Nov 06 10:29:09 PST 2022
     */
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Nov 06 10:29:09 PST 2022
     */
    Goods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Nov 06 10:29:09 PST 2022
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Sun Nov 06 10:29:09 PST 2022
     */
    int updateByPrimaryKey(Goods record);
}