package com.bucket.shop.service.goods.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bucket.shop.common.util.ConvetorUtil;
import com.bucket.shop.dal.dao.item.attribute.AttributeNameDao;
import com.bucket.shop.dal.dao.item.attribute.AttributeValueDao;
import com.bucket.shop.dal.dao.item.category.CategoryDao;
import com.bucket.shop.model.dbo.goods.attribute.AttributeValueDo;
import com.bucket.shop.model.request.goods.AttributeQueryRequest;
import com.bucket.shop.model.ro.attribute.AttributeValueRo;
import com.bucket.shop.service.goods.AttributeValueService;
import com.google.common.collect.Maps;

@Service
public class AttributeValueServiceImpl implements AttributeValueService{
	
	@Resource
	private AttributeNameDao attributeNameDao;
	
	@Resource
	private AttributeValueDao attributeValueDao;
	
	@Resource
	private CategoryDao          categoryDao;

	@Override
	public AttributeValueRo insert(AttributeValueRo attributeValueRo) {
		AttributeValueDo attrValueDo = ConvetorUtil.conveter(attributeValueRo,AttributeValueDo.class);
		attributeValueDao.insert(attrValueDo);
		return ConvetorUtil.conveter(attrValueDo,AttributeValueRo.class);
	}

	@Override
	public Boolean update(AttributeValueRo attributeValueRo) {
		AttributeValueDo attrValueDo = ConvetorUtil.conveter(attributeValueRo,AttributeValueDo.class);
		return attributeValueDao.update(attrValueDo);
	}

	@Override
	public Boolean batchUpdate(List<AttributeValueRo> attributeValueRoList) {
		for(AttributeValueRo ro:attributeValueRoList){
			AttributeValueDo attrValueDo = ConvetorUtil.conveter(ro,AttributeValueDo.class);
		    attributeValueDao.update(attrValueDo);
		}
		return true;
	}

	@Override
	public List<AttributeValueRo> query(Map<String, Object> map) {
		 List<AttributeValueDo> result = attributeValueDao.query(map);
	     return ConvetorUtil.conveterList(result, AttributeValueRo.class);
	}

	@Override
	public Boolean delAttributeValue(Long attrValueId) {
		attributeValueDao.delAttributeValue(attrValueId);
		Map<String, Object> paramMap = Maps.newHashMap();
        paramMap.put("attrValueId", attrValueId);
        //brandAttrValueRefDao.delete(paramMap);
        return true;
	}

	@Override
	public Boolean batchDelAttributeValue(List<Long> attrValueIds) {
		for(Long id:attrValueIds){
			delAttributeValue(id);
		}
		return true;
	}

	@Override
	public List<AttributeValueRo> queryByOption(Integer attrNameId, Integer attrValueId, Integer status) {
		 List<AttributeValueDo> list = attributeValueDao.queryByOption(attrNameId, attrValueId, status);
	     return ConvetorUtil.conveterList(list, AttributeValueRo.class);
	}

	@Override
	public List<AttributeValueRo> queryAttributeByValue(AttributeQueryRequest queryRequest) {
		return null;
	}

	@Override
	public AttributeValueRo queryAttrEqualValue(Integer attrNameId, String attrValue) {
		AttributeValueDo attrDo = attributeValueDao.queryAttrEqualValue(attrNameId, attrValue);
		return ConvetorUtil.conveter(attrDo, AttributeValueRo.class);
	}

	@Override
	public void delAttributeValueByValue(Integer attrNameId, String brandName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AttributeValueRo queryAttributeValueById(String attrValueId) {
		AttributeValueDo attrDo = attributeValueDao.getById(Long.parseLong(attrValueId));
		return ConvetorUtil.conveter(attrDo, AttributeValueRo.class);
	}

	@Override
	public Integer updateBrandAttrStatus(AttributeValueRo attributeValueRO) {
		AttributeValueDo attrValueDo = ConvetorUtil.conveter(attributeValueRO,AttributeValueDo.class);;
		return attributeValueDao.updateBrandAttrStatus(attrValueDo);
	}
	
	 
}
