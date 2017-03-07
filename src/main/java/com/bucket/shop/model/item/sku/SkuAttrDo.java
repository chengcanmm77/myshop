package com.bucket.shop.model.item.sku;

import com.bucket.shop.model.BaseDo;

public class SkuAttrDo extends BaseDo {

    /**
     * sku属性ID 主键
     */
    private Long    id;
    /**
     * sku ID
     */
    private Long    skuId;
    /**
     * 属性名ID
     */
    private Long    attrNameId;
    /**
     * 属性名
     */
    private String  attrName;
    /**
     * 属性值ID
     */
    private Long    attrValueId;
    /**
     * 属性值
     */
    private String  attrValue;
    /**
     * 是否必填 true 必填 false 非必填
     */
    private Boolean isRequired;
    /**
     * 属性序号
     */
    private Integer attrOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getAttrNameId() {
        return attrNameId;
    }

    public void setAttrNameId(Long attrNameId) {
        this.attrNameId = attrNameId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
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

    public Integer getAttrOrder() {
        return attrOrder;
    }

    public void setAttrOrder(Integer attrOrder) {
        this.attrOrder = attrOrder;
    }

}
