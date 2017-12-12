package com.bucket.shop.manager.item.impl;

import java.util.List;

import com.bucket.shop.manager.item.AttributeManagerService;
import com.bucket.shop.model.request.goods.AttrbuteManagerQueryRequest;
import com.bucket.shop.model.request.goods.AttributeQueryRequest;
import com.bucket.shop.model.ro.attribute.AttributeDataRo;
import com.bucket.shop.model.ro.attribute.AttributeNameRo;
import com.bucket.shop.model.ro.attribute.AttributeRo;
import com.bucket.shop.model.ro.attribute.AttributeValueRo;

public class AttributeManagerServiceImpl implements AttributeManagerService{

	@Override
	public boolean insertAttribute(AttributeDataRo attrDataRo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAttribute(AttributeRo attrRo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AttributeDataRo queryAttributeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AttributeDataRo> queryAttributeList(AttrbuteManagerQueryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttributeRo queryAttributeByAttrNameId(AttributeQueryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttributeRo queryAttributeList(AttributeQueryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAttributeById(AttributeRo attributeRo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAttrVale(List<Long> attrValueIds) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAttrValueStatus(List<AttributeValueRo> attrValueList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAttrNameStatus(List<AttributeNameRo> attrNameList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AttributeValueRo> queryAttributeByValue(AttributeQueryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AttributeValueRo> querySkuAttributeList(AttributeQueryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
