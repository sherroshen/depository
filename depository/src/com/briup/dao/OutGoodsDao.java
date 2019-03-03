package com.briup.dao;

import java.util.List;

import com.briup.bean.Goods;

public interface OutGoodsDao {
	void saveOutGoods(Goods goods) throws Exception;
	//更新用户
	void updateOutGoods(Goods goods)throws Exception;
	//查找用户
	List<Goods> findOutGoodsByName(String name) throws Exception;
	List<Goods> findOutGoods() throws Exception;
	List<Goods> findOutGoodsById(String id) throws Exception;
}
