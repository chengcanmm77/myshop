package com.bucket.shop.dal.dao.item;

import com.bucket.shop.model.dbo.goods.ItemPurchaseDo;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.dal.dao.base.BaseDao;
import com.bucket.shop.dal.mapper.BaseMapper;
import com.bucket.shop.dal.mapper.item.ItemPurchaseMapper;

/**
 * 限购
 * 
 * @author yuguantou
 * @version 1.0
 * @date 2017年12月18日
 */
@Repository
public class ItemPurchaseDao extends BaseDao<ItemPurchaseDo>{
	
	@Resource
	private ItemPurchaseMapper itemPurchaseMapper;

	@Override
	protected BaseMapper getMapper() {
		return itemPurchaseMapper;
	}

}
