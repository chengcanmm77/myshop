package com.bucket.shop.model.ro.attribute;

import java.io.Serializable;
import java.util.List;

import com.bucket.shop.model.ro.BaseRo;

public class AttributeDataRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = 7364201541949159208L;
	/**
     * 属性名ID
     */
    private Integer attrNameId;
    /**
     * 属性名称
     */
    private String attrName;
    /**
     * 所属类目ID,叶子类目
     */
    private Integer categoryId;
    /**
     * 所属类目名称
     */
    private String categoryName;
    /**
     * 排序
     */
    private Integer attrOrder=1;
    /**
     * 属性类型:1.关键属性 2.非关键属性 3.销售属性
     */
    private Integer attrType;
    /**
     * 是否必填 true 必填 false 非必填
     */
    private Boolean isRequired=false;
    /**
     * 商城是否显示 true-显示, false 隐藏
     */
    private Boolean isShow; 
    /**
     * 状态 0 删除 1 禁用 2 使用
     */
    private Integer status=1;
    /**
     *  是否前台显示 true 是 false 否
     */
    private Boolean isFrontShow;
    
    private List<AttributeValueRo> list;

	public Integer getAttrNameId() {
		return attrNameId;
	}

	public void setAttrNameId(Integer attrNameId) {
		this.attrNameId = attrNameId;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	public Boolean getIsShow() {
		return isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getIsFrontShow() {
		return isFrontShow;
	}

	public void setIsFrontShow(Boolean isFrontShow) {
		this.isFrontShow = isFrontShow;
	}

	public List<AttributeValueRo> getList() {
		return list;
	}

	public void setList(List<AttributeValueRo> list) {
		this.list = list;
	}
    
    
}
