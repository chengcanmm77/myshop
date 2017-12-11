package com.bucket.shop.model.ro.attribute;

import java.io.Serializable;
import java.util.List;

import com.bucket.shop.model.ro.BaseRo;

public class AttributeValueRo extends BaseRo implements Serializable{

	 /**
     * 属性名ID
     */
     private Long  attrNameId;
     /**
      * 关联属性ID
      */
     private Long  attrNameRefId;
    /**
     * 属性值ID
     */
    private Long   attrValueId;
    /**
     * 属性值
     */
    private String            attrValue;
    /**
     * 属性名是否必选
     */
    private Boolean           isRequired;
    /**
     * 状态 0 删除 1 禁用 2 使用
     */
    private Integer           status;
  
    /**
     * 查询关联属性
     */
    private List<AttributeValueRo> refAttrValueList;
    /**
     * 是否选中（sku加载属性专用）
     */
    private boolean isSelected;
	public Long getAttrNameId() {
		return attrNameId;
	}
	public void setAttrNameId(Long attrNameId) {
		this.attrNameId = attrNameId;
	}
	public Long getAttrNameRefId() {
		return attrNameRefId;
	}
	public void setAttrNameRefId(Long attrNameRefId) {
		this.attrNameRefId = attrNameRefId;
	}
	public Long getAttrValueId() {
		return attrValueId;
	}
	public void setAttrValueId(Long attrValueId) {
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<AttributeValueRo> getRefAttrValueList() {
		return refAttrValueList;
	}
	public void setRefAttrValueList(List<AttributeValueRo> refAttrValueList) {
		this.refAttrValueList = refAttrValueList;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
    
    
}
