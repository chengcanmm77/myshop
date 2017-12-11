package com.bucket.shop.model.ro.attribute;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class AttributeRefRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = -6577992059085924556L;
	/**
     * 主键
     */
    private Integer attrRefId;
    /**
     * 类目ID
     */
    private Integer categoryId;
    /**
     * 属性ID
     */
    private Integer attrNameId;
    /**
     * 属性值ID
     */
    private Integer attrValueId;
    /**
     * 属性关联ID
     */
    private Integer attrNameRefId;
    /**
     * 关联属性名称
     */
    private String attrNameRef;
    /**
     * 属性值关联ID
     */
    private Integer attrValueRefId;
    /**
     * 关联属性值名称
     */
    private String attrValueRef;
	public Integer getAttrRefId() {
		return attrRefId;
	}
	public void setAttrRefId(Integer attrRefId) {
		this.attrRefId = attrRefId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getAttrNameId() {
		return attrNameId;
	}
	public void setAttrNameId(Integer attrNameId) {
		this.attrNameId = attrNameId;
	}
	public Integer getAttrValueId() {
		return attrValueId;
	}
	public void setAttrValueId(Integer attrValueId) {
		this.attrValueId = attrValueId;
	}
	public Integer getAttrNameRefId() {
		return attrNameRefId;
	}
	public void setAttrNameRefId(Integer attrNameRefId) {
		this.attrNameRefId = attrNameRefId;
	}
	public String getAttrNameRef() {
		return attrNameRef;
	}
	public void setAttrNameRef(String attrNameRef) {
		this.attrNameRef = attrNameRef;
	}
	public Integer getAttrValueRefId() {
		return attrValueRefId;
	}
	public void setAttrValueRefId(Integer attrValueRefId) {
		this.attrValueRefId = attrValueRefId;
	}
	public String getAttrValueRef() {
		return attrValueRef;
	}
	public void setAttrValueRef(String attrValueRef) {
		this.attrValueRef = attrValueRef;
	}
    
}
