package com.bucket.shop.service.goods.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import com.bucket.shop.common.util.ConvetorUtil;
import com.bucket.shop.dal.dao.item.attribute.AttributeNameDao;
import com.bucket.shop.model.dbo.goods.attribute.AttributeNameDo;
import com.bucket.shop.model.ro.attribute.AttributeNameRo;
import com.bucket.shop.service.goods.AttributeNameService;

@Service
public class AttributeNameServiceImpl implements AttributeNameService{
	
	@Resource
	private AttributeNameDao attributeNameDao;

	@Override
	public AttributeNameDo insert(AttributeNameRo attributeNameRo) {
		AttributeNameDo attrDo = ConvetorUtil.conveter(attributeNameRo, AttributeNameDo.class);
		attributeNameDao.insert(attrDo);
		return attrDo;
	}

	@Override
	public Boolean update(AttributeNameRo attributeNameRo) {
		AttributeNameDo attrDo = ConvetorUtil.conveter(attributeNameRo, AttributeNameDo.class);
		return attributeNameDao.update(attrDo);
	}

	@Override
	public List<AttributeNameRo> query(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttributeNameRo queryAttributeNameById(Long id) {
		AttributeNameDo aDo = attributeNameDao.queryAttributeNameById(id);
		  if(aDo==null){
	          return null;
		  }
		return ConvetorUtil.conveter(aDo, AttributeNameRo.class);
	}

	@Override
	public List<AttributeNameRo> queryByCategoryIds(List<Long> categoryIds, String brandName) {
		if (CollectionUtils.isEmpty(categoryIds)) {
			return null;
		}
		List<AttributeNameDo> attrList = attributeNameDao.queryByCategoryIds(categoryIds, brandName);
		return ConvetorUtil.conveterList(attrList,AttributeNameRo.class);
	}

}
