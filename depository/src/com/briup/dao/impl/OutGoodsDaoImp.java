package com.briup.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Goods;
import com.briup.bean.OutGoodsMapper;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.OutGoodsDao;

public class OutGoodsDaoImp implements OutGoodsDao{

	@Override
	public void saveOutGoods(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSessionFactory.getSession();
		session.clearCache();
		OutGoodsMapper outGoodsMapper = session.getMapper(OutGoodsMapper.class);
		outGoodsMapper.insertOutGoods(goods);
	}

	@Override
	public void updateOutGoods(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSessionFactory.getSession();
		session.clearCache();
		OutGoodsMapper outGoodsMapper = session.getMapper(OutGoodsMapper.class);
		
		
	}

	@Override
	public List<Goods> findOutGoodsByName(String name) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSessionFactory.getSession();
		session.clearCache();
		OutGoodsMapper outGoodsMapper = session.getMapper(OutGoodsMapper.class);
		//outGoodsMapper.selectOutGoodsByName(name);
		return outGoodsMapper.selectOutGoodsByName(name);
	}

	@Override
	public List<Goods> findOutGoods() throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSessionFactory.getSession();
		session.clearCache();
		OutGoodsMapper outGoodsMapper = session.getMapper(OutGoodsMapper.class);
		
		return outGoodsMapper.selectAllOutGoods();
	}

	@Override
	public List<Goods> findOutGoodsById(String id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSessionFactory.getSession();
		session.clearCache();
		OutGoodsMapper outGoodsMapper = session.getMapper(OutGoodsMapper.class);
		
		return outGoodsMapper.selectOutGoodsById(id);
	}

}
