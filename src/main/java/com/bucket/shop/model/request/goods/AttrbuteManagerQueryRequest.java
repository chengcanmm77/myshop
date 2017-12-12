package com.bucket.shop.model.request.goods;

import java.io.Serializable;

public class AttrbuteManagerQueryRequest implements Serializable{
	private static final long serialVersionUID = -2599649260995343496L;
	/**
	 * 类目ID 叶子类目
	 */
	private Integer categoryId;
	/**
	 * 状态 0 删除 1启用 2禁用
	 */
	private Integer status;
	/**
	 * 是否查询属性值信息，true:查询 false：不查询
	 */
	private Boolean isQueryAttrValue = false;
    /**
     * 属性类型:1.关键属性 2.非关键属性 3.销售属性
     */
    private Integer attrType;
    
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getIsQueryAttrValue() {
		return isQueryAttrValue;
	}
	public void setIsQueryAttrValue(Boolean isQueryAttrValue) {
		this.isQueryAttrValue = isQueryAttrValue;
	}
	public Integer getAttrType() {
		return attrType;
	}
	public void setAttrType(Integer attrType) {
		this.attrType = attrType;
	}
    
    
    
}
