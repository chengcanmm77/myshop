package com.bucket.shop.service.item.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bucket.shop.common.so.item.sku.SkuSo;
import com.bucket.shop.common.vo.item.sku.SkuVo;
import com.bucket.shop.dal.dao.item.sku.SkuDao;
import com.bucket.shop.service.item.SkuService;

@Service
public class SkuServiceImpl implements SkuService {
	
	@Resource
	private SkuDao skuDao;

	@Override
	public SkuVo insert(SkuVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SkuVo update(SkuVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SkuVo queryById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SkuVo> queryList(SkuSo so) {
		// TODO Auto-generated method stub
		return null;
	}

}
