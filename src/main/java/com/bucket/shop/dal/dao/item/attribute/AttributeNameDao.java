package com.bucket.shop.dal.dao.item.attribute;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.dal.mapper.item.attribute.AttributeNameMapper;
import com.bucket.shop.model.dbo.goods.attribute.AttributeNameDo;
import com.google.common.collect.Maps;

@Repository
public class AttributeNameDao {

    @Resource
    private AttributeNameMapper attributeNameMapper;
    
    public Long insert(AttributeNameDo attributeName){
        Long result = attributeNameMapper.insert(attributeName);
        return result;
    }
    
    public Boolean update(AttributeNameDo attributeName){
    	Long updateNum = attributeNameMapper.update(attributeName);
        if(updateNum>0)
            return true;
        else 
            return false;
    }

    
    public AttributeNameDo queryAttributeNameById(Long id){
        AttributeNameDo result = attributeNameMapper.queryDoById(id);
        return result;
    }

	public List<AttributeNameDo> queryByCategoryIds(List<Long> categoryIds, String brandName){
		Map<String, Object> paramsMap = Maps.newHashMap();
		paramsMap.put("categoryIds", categoryIds);
		paramsMap.put("attrName", brandName);
		return attributeNameMapper.queryByCategoryIds(paramsMap);
	}
}
