package com.bucket.shop.service.goods;

import com.bucket.shop.model.dbo.goods.attribute.AttributeNameDo;
import com.bucket.shop.model.ro.attribute.AttributeNameRo;

import java.util.List;
import java.util.Map;

public interface AttributeNameService {

	AttributeNameDo insert(AttributeNameRo attributeNameRo);

	Boolean update(AttributeNameRo attributeNameRo);

	List<AttributeNameRo> query(Map<String, Object> map);

	/**
	 * 
	 * @description:根据ID查询属性信息
	 * 
	 */
	 AttributeNameRo queryAttributeNameById(Long id);

	/**
	 * 根据类目以及品牌查询指定类目下所有的品牌属性
	 * 
	 */
	List<AttributeNameRo> queryByCategoryIds(List<Long> categoryIds, String brandName);
}
