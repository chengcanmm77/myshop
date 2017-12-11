package com.bucket.shop.model.ro.attribute;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class AttributeNameRo extends BaseRo implements Serializable{

	/**
     * 属性名ID
     */
    private Long           id;
    /**
     * 属性名称
     */
    private String            name;
    /**
     * 所属类目ID,叶子类目
     */
    private Long           categoryId;
    /**
     * 排序
     */
    private Integer           attrOrder;
    /**
     * 属性类型:1.关键属性 2.非关键属性 3.销售属性
     */
    private Integer attrType;
    /**
     * 状态 0 删除 1 禁用 2 使用
     */
    private Integer           status;
    /**
     * 是否必填 true 必填 false 非必填
     */
    private Boolean           isRequired;
    /**
     *  是否前台显示 true 是 false 否
     */
    private Boolean           isFrontShow;
    /**
     * 关联类型：1-品牌， 2-属性， 3-无
     */
    private Integer referType;
    /**
     * 当前属性依赖的属性ID
     */
    private Long attributeNameIdRefered;
    /**
     * 当前属性依赖的属性名
     */
    private String attributeNameRefered;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getAttrOrder() {
		return attrOrder;
	}
	public void setAttrOrder(Integer attrOrder) {
		this.attrOrder = attrOrder;
	}
	public Integer getAttrType() {
		return attrType;
	}
	public void setAttrType(Integer attrType) {
		this.attrType = attrType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getIsRequired() {
		return isRequired;
	}
	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}
	public Boolean getIsFrontShow() {
		return isFrontShow;
	}
	public void setIsFrontShow(Boolean isFrontShow) {
		this.isFrontShow = isFrontShow;
	}
	public Integer getReferType() {
		return referType;
	}
	public void setReferType(Integer referType) {
		this.referType = referType;
	}
	public Long getAttributeNameIdRefered() {
		return attributeNameIdRefered;
	}
	public void setAttributeNameIdRefered(Long attributeNameIdRefered) {
		this.attributeNameIdRefered = attributeNameIdRefered;
	}
	public String getAttributeNameRefered() {
		return attributeNameRefered;
	}
	public void setAttributeNameRefered(String attributeNameRefered) {
		this.attributeNameRefered = attributeNameRefered;
	}
    
    
}
