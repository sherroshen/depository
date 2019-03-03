package com.briup.bean;

import java.util.List;

public interface GoodsMapper {
	void insertGoods(Goods a);
	List<Goods> selectGoodsByName(String name);
	List<Goods> selectAllGoods();
	List<Goods> selectGoodsById(String id);
	void updateGoods(Goods goods);
}
