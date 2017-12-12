package com.bucket.shop.model.dbo.goods.attribute;

import com.bucket.shop.model.dbo.BaseDo;

public class BrandAttrValueRefDo extends BaseDo {
	private static final long serialVersionUID = -288066015468834424L;

	private Integer brandId;

    private String  brandName;

    private Integer attrNameId;
    /**
     * 属性名是否必选
     */
    private Boolean isRequired;

    private String  attrName;

    private Integer attrValueId;

    private String  attrValueName;

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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
