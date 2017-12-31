package com.bucket.shop.model.ro.attribute;

import com.bucket.shop.model.ro.BaseRo;

import java.io.Serializable;
import java.util.List;

public class AttributeRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = -5794336710519641294L;
	
	/**
     * 属性基础对象
     */
    private AttributeNameRo       attrNameRo;
    /**
     * 属性对应属性值对象列表
     */
    private List<AttributeValueRo> attrValueRoList;

	public AttributeNameRo getAttrNameRo() {
		return attrNameRo;
	}

	public void setAttrNameRo(AttributeNameRo attrNameRo) {
		this.attrNameRo = attrNameRo;
	}

	public List<AttributeValueRo> getAttrValueRoList() {
		return attrValueRoList;
	}

	public void setAttrValueRoList(List<AttributeValueRo> attrValueRoList) {
		this.attrValueRoList = attrValueRoList;
	}
}
