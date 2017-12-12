package com.bucket.shop.dal.dao.item.attribute;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.dal.mapper.item.attribute.AttributeValueMapper;
import com.bucket.shop.model.dbo.goods.attribute.AttributeValueDo;
import com.google.common.collect.Maps;

@Repository
public class AttributeValueDao {

	@Resource
	private AttributeValueMapper attributeValueMapper;
	
	public AttributeValueDo getById(Long id){
		return attributeValueMapper.queryDoById(id);
	}

	public AttributeValueDo insert(AttributeValueDo attributeValueDO) {
		attributeValueMapper.insert(attributeValueDO);
		return attributeValueDO;
	}

	public Boolean update(AttributeValueDo attributeValueDO) {
		Long updateNum = attributeValueMapper.update(attributeValueDO);
		if (updateNum > 0)
			return true;
		else
			return false;
	}

	public Boolean delAttributeValue(Long attrValueId) {
		Integer updateNum = attributeValueMapper.delete(attrValueId);
		if (updateNum > 0)
			return true;
		else
			return false;
	}

  public  List<AttributeValueDo> query(Map<String,Object> map){
        List<AttributeValueDo> result = attributeValueMapper.query(map);
        return result;
    }
	  
	public List<AttributeValueDo> queryByOption(Integer attrNameId, Integer attrValueId, Integer status) {
		Map<String, Object> paramsMap = Maps.newHashMap();
		paramsMap.put("attrNameId", attrNameId);
		paramsMap.put("attrValueId", attrValueId);
		paramsMap.put("status", status);
		return attributeValueMapper.queryByOption(paramsMap);
	}

	public List<AttributeValueDo> queryAttributeByValue(AttributeValueDo attributeValueDO) {
		return attributeValueMapper.queryAttributeByValue(attributeValueDO);
	}

	public AttributeValueDo queryAttrEqualValue(Integer attrNameId, String attrValue) {
		Map<String, Object> paramsMap = Maps.newHashMap();
		paramsMap.put("attrNameId", attrNameId);
		paramsMap.put("attrValue", attrValue);
		return attributeValueMapper.queryAttrEqualValue(paramsMap);
	}

	public Integer updateBrandAttrStatus(AttributeValueDo attributeValueDO) {
		return attributeValueMapper.updateBrandAttrStatus(attributeValueDO);
	}

}
