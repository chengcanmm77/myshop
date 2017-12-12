package com.bucket.shop.model.dbo.item.category;

import com.bucket.shop.model.dbo.BaseDo;

public class CategoryAttrValueRefDo extends BaseDo{
	private static final long serialVersionUID = -3766025276366564359L;

    private Integer categoryId;
    
    private String  categoryName;

    private Integer attrNameId;
    /**
     * 属性名是否必选
     */
    private Boolean isRequired;
    
    private String attrName;

    private Integer attrValueId;
    
    private String attrValueName;
    
    public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
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

    public String getAttrValueName() {
        return attrValueName;
    }

    public void setAttrValueName(String attrValueName) {
        this.attrValueName = attrValueName;
    }

}
