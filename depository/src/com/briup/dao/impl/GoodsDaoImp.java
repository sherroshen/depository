package com.briup.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Goods;
import com.briup.bean.GoodsMapper;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.GoodsDao;

public class GoodsDaoImp implements GoodsDao{
	SqlSession session = MybatisSessionFactory.getSession();
	@Override
	public void saveGoods(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		session.clearCache();
		GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
		goodsMapper.insertGoods(goods);
	}

	@Override
	public void updateGoods(Goods goods) throws Exception{
		// TODO Auto-generated method stub
		session.clearCache();
		GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
		goodsMapper.updateGoods(goods);
	}
    
	@Override
	public List<Goods> findGoodsByName(String name) throws Exception {
		// TODO Auto-generated method stub
		session.clearCache();
		GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
		List<Goods> gList = goodsMapper.selectGoodsByName(name);
		return gList;
	}

	

	@Override
	public List<Goods> findGoods() throws Exception {
		// TODO Auto-generated method stub
		session.clearCache();
		GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
		List<Goods> AGoods = goodsMapper.selectAllGoods();
		return AGoods;
	}

	@Override
	public List<Goods> findGoodsById(String id) throws Exception {
		// TODO Auto-generated method stub
		session.clearCache();
		GoodsMapper goodsMapper=session.getMapper(GoodsMapper.class);
		List<Goods> gList = goodsMapper.selectGoodsById(id);
		return gList;
		
	}

	

}
