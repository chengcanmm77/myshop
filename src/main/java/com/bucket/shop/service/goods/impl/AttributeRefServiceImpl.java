package com.bucket.shop.service.goods.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.bucket.shop.common.util.ConvetorUtil;
import com.bucket.shop.dal.dao.item.attribute.AttributeRefDao;
import com.bucket.shop.model.dbo.goods.attribute.AttributeRefDo;
import com.bucket.shop.model.request.goods.AttributeQueryRequest;
import com.bucket.shop.model.ro.attribute.AttributeRefRo;
import com.bucket.shop.service.goods.AttributeRefService;

@Service
public class AttributeRefServiceImpl implements AttributeRefService{
	
	@Resource
	private AttributeRefDao attributeRefDao;
	
	@Override
	public void insertAttrRef(List<AttributeRefRo> attrRefList) {
		if (CollectionUtils.isEmpty(attrRefList)) {
            return ;
        }
        attributeRefDao.insertAttrRef(ConvetorUtil.conveterList(attrRefList, AttributeRefDo.class));
		
	}

	@Override
	public void updateAttrRef(List<AttributeRefRo> attrRefList) {
		if (CollectionUtils.isEmpty(attrRefList)) {
           return;
        }
        
        // 根据当前属性ID删除关联的所有属性值
        attributeRefDao.deleteByAttrNameId(attrRefList.get(0).getAttrNameId());
        insertAttrRef(attrRefList);
		
	}

	@Override
	public Integer delete(Integer attrNameId) {
		return attributeRefDao.deleteByAttrNameId(attrNameId);
	}

	@Override
	public Integer deleteByAttr(Map<String, Object> paramsMap) {
		  return attributeRefDao.deleteByRefAttr(paramsMap);
	}

	@Override
	public Integer deleteByRefAttr(Map<String, Object> paramsMap) {
		return null;
	}

	@Override
	public List<AttributeRefRo> queryAttrRefList(AttributeQueryRequest queryRequest) {
		return ConvetorUtil.conveterList(attributeRefDao.queryAttrRefList(queryRequest),AttributeRefRo.class);
	}

	@Override
	public List<AttributeRefRo> queryAttrRefAInfoList(Integer attrNameId) {
		return ConvetorUtil.conveterList(attributeRefDao.queryAttrRefInfoList(attrNameId),AttributeRefRo.class);
	}

}
