package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class SkuAttrRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = -7206119146736489066L;
	/**
	 * sku属性ID 主键
	 */
	private Integer skuAttrId;
	/**
	 * sku ID
	 */
	private Integer skuId;
	/**
	 * 属性名ID
	 */
	private Integer attrNameId;
	/**
	 * 属性名
	 */
	private String attrName;
	/**
	 * 属性值ID
	 */
	private Integer attrValueId;
	/**
	 * 属性值
	 */
	private String attrValue;
	/**
     * 是否必填 true 必填 false 非必填
     */
    private Boolean isRequired;
    
    /**
     * 属性是否展示
     */
    private Boolean isShow;
    /**
     * 属性序号
     */
    private Integer attrOrder;
    
	public Integer getSkuAttrId() {
		return skuAttrId;
	}
	public void setSkuAttrId(Integer skuAttrId) {
		this.skuAttrId = skuAttrId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
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
	public Integer getAttrOrder() {
		return attrOrder;
	}
	public void setAttrOrder(Integer attrOrder) {
		this.attrOrder = attrOrder;
	}
    
    
}
