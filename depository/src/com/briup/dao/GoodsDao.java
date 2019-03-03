package com.briup.dao;

import java.util.List;
import com.briup.bean.Goods;

public interface GoodsDao {
	    //保存用户
		void saveGoods(Goods goods) throws Exception;
		//更新用户
		void updateGoods(Goods goods)throws Exception;
		//查找用户
		List<Goods> findGoodsByName(String name) throws Exception;
		List<Goods> findGoods() throws Exception;
		List<Goods> findGoodsById(String id) throws Exception;
}
