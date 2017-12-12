package com.bucket.shop.service.goods;

import java.util.List;
import java.util.Map;

import com.bucket.shop.model.request.goods.AttributeQueryRequest;
import com.bucket.shop.model.ro.attribute.AttributeRefRo;


public interface AttributeRefService {

	/**
     * 持久化属性关联关系
     */
    public void insertAttrRef(List<AttributeRefRo> attrRefList);

    /**
     * 更新属性关联关系，先删除后新增（事务操作）
     */
    public void updateAttrRef(List<AttributeRefRo> attrRefList);

    /**
     * 根据属性ID或者属性值ID删除关联属性
     */
    public Integer delete(Integer attrNameId);

    /**
     * 根据属性名ID或属性值ID列表删除关联关系
     */
    public Integer deleteByAttr(Map<String, Object> paramsMap);

    /**
     * 根据关联属性删除
     */
    public Integer deleteByRefAttr(Map<String, Object> paramsMap);

    /**
     * 查询属性关联信息
     */
    public List<AttributeRefRo> queryAttrRefList(AttributeQueryRequest queryRequest);

    public List<AttributeRefRo> queryAttrRefAInfoList(Integer attrNameId);
}
