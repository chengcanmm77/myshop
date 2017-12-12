package com.bucket.shop.service.goods.impl;

import java.util.List;
import java.util.Map;

import com.bucket.shop.model.request.goods.AttributeQueryRequest;
import com.bucket.shop.model.ro.attribute.AttributeRefRo;
import com.bucket.shop.service.goods.AttributeRefService;

public class AttributeRefServiceImpl implements AttributeRefService{
	
	@Override
	public void insertAttrRef(List<AttributeRefRo> attrRefList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAttrRef(List<AttributeRefRo> attrRefList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer delete(Integer attrNameId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteByAttr(Map<String, Object> paramsMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteByRefAttr(Map<String, Object> paramsMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AttributeRefRo> queryAttrRefList(AttributeQueryRequest queryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AttributeRefRo> queryAttrRefAInfoList(Integer attrNameId) {
		// TODO Auto-generated method stub
		return null;
	}

}
