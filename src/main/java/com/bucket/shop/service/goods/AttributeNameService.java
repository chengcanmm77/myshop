package com.bucket.shop.service.goods;

import java.util.List;
import java.util.Map;

import com.bucket.shop.model.dbo.goods.attribute.AttributeNameDo;
import com.bucket.shop.model.ro.attribute.AttributeNameRo;

public interface AttributeNameService {

	public AttributeNameDo insert(AttributeNameRo attributeNameRo);

	public Boolean update(AttributeNameRo attributeNameRo);

	public List<AttributeNameRo> query(Map<String, Object> map);

	/**
	 * 
	 * @description:根据ID查询属性信息
	 * 
	 */
	public AttributeNameRo queryAttributeNameById(Long id);

	/**
	 * 根据类目以及品牌查询指定类目下所有的品牌属性
	 * 
	 */
	public List<AttributeNameRo> queryByCategoryIds(List<Long> categoryIds, String brandName);
}
