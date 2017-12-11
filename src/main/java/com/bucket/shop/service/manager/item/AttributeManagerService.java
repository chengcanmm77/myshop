package com.bucket.shop.service.manager.item;

import java.util.List;

import com.bucket.shop.model.request.item.AttrbuteManagerQueryRequest;
import com.bucket.shop.model.request.item.AttributeQueryRequest;
import com.bucket.shop.model.ro.attribute.AttributeDataRo;
import com.bucket.shop.model.ro.attribute.AttributeNameRo;
import com.bucket.shop.model.ro.attribute.AttributeRo;
import com.bucket.shop.model.ro.attribute.AttributeValueRo;

public interface AttributeManagerService {

	public boolean insertAttribute(AttributeDataRo attrDataRo);
	
	public boolean insertAttribute(AttributeRo attrRo);
	
	public AttributeDataRo queryAttributeById(Long id);
	
	public List<AttributeDataRo> queryAttributeList(AttrbuteManagerQueryRequest request);
	
	public AttributeRo queryAttributeByAttrNameId(AttributeQueryRequest request);
	
	public AttributeRo queryAttributeList(AttributeQueryRequest request);
	
	public boolean updateAttributeById(AttributeRo attributeRo);
	
	public boolean deleteAttrVale(List<Long> attrValueIds);
	
	public boolean updateAttrValueStatus(List<AttributeValueRo> attrValueList);
	
	public boolean updateAttrNameStatus(List<AttributeNameRo> attrNameList);
	
	public List<AttributeValueRo> queryAttributeByValue(AttributeQueryRequest request);
	
	public List<AttributeValueRo> querySkuAttributeList(AttributeQueryRequest request);
}
