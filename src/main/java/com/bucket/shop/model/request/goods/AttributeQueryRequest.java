package com.bucket.shop.model.request.goods;

import java.io.Serializable;

public class AttributeQueryRequest implements Serializable{
	private static final long serialVersionUID = 4872259453824941762L;
	/**
     * 类目ID
     */
    private Integer categoryId;
    /**
     * 属性ID
     */
    private Integer attrNameId;
    /**
     * 属性ID(被排除)
     */
    private Integer excludeAttrNameId;
    /**
     * 属性值ID
     */
    private Integer attrValueId;
    /**
     * 属性值名称
     */
    private String attrValue;
    /**
     * 属性关联ID
     */
    private Integer attrNameRefId;
    /**
     * 属性值关联ID
     */
    private Integer attrValueRefId;
    /**
     * 是否查询属性值信息
     */
    private boolean isQueryAttrValue;
    /**
     * 状态：1-使用， 2-禁用
     */
    private Integer status;
    /**
     * 属性值关联的品牌ID
     */
    private Integer brandId;
    /**
     * skuID
     */
    private Integer skuId;
    /**类目名称*/
    private String categoryName;
    /**属性名名称*/
    private String attributeName;
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
	public Integer getExcludeAttrNameId() {
		return excludeAttrNameId;
	}
	public void setExcludeAttrNameId(Integer excludeAttrNameId) {
		this.excludeAttrNameId = excludeAttrNameId;
	}
	public Integer getAttrValueId() {
		return attrValueId;
	}
	public void setAttrValueId(Integer attrValueId) {
		this.attrValueId = attrValueId;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	public Integer getAttrNameRefId() {
		return attrNameRefId;
	}
	public void setAttrNameRefId(Integer attrNameRefId) {
		this.attrNameRefId = attrNameRefId;
	}
	public Integer getAttrValueRefId() {
		return attrValueRefId;
	}
	public void setAttrValueRefId(Integer attrValueRefId) {
		this.attrValueRefId = attrValueRefId;
	}
	public boolean isQueryAttrValue() {
		return isQueryAttrValue;
	}
	public void setQueryAttrValue(boolean isQueryAttrValue) {
		this.isQueryAttrValue = isQueryAttrValue;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
    
    
}
