package com.bucket.shop.model.ro.attribute;

import java.io.Serializable;
import java.util.List;

import com.bucket.shop.model.ro.BaseRo;

public class AttributeRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = -5794336710519641294L;
	
	/**
     * 属性基础对象
     */
    private AttributeNameRo       attrNameRO;
    /**
     * 属性对应属性值对象列表
     */
    private List<AttributeValueRo> attrValueROList;
	public AttributeNameRo getAttrNameRO() {
		return attrNameRO;
	}
	public void setAttrNameRO(AttributeNameRo attrNameRO) {
		this.attrNameRO = attrNameRO;
	}
	public List<AttributeValueRo> getAttrValueROList() {
		return attrValueROList;
	}
	public void setAttrValueROList(List<AttributeValueRo> attrValueROList) {
		this.attrValueROList = attrValueROList;
	}
    
}
