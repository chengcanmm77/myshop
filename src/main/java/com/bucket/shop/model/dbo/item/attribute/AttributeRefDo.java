/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.bucket.shop.model.dbo.item.attribute;

import com.bucket.shop.model.dbo.BaseDo;

public class AttributeRefDo extends BaseDo {
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
     * 关联属性ID
     */
    private Integer attrNameRefId;
    /**
     * 关联属性名称
     */
    private String  attrNameRef;
    /**
     * 关联属性值ID
     */
    private Integer attrValueRefId;
    /**
     * 关联属性值名称
     */
    private String  attrValueRef;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAttrRefId() {
        return attrRefId;
    }

    public void setAttrRefId(Integer attrRefId) {
        this.attrRefId = attrRefId;
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

    public Integer getAttrValueRefId() {
        return attrValueRefId;
    }

    public void setAttrValueRefId(Integer attrValueRefId) {
        this.attrValueRefId = attrValueRefId;
    }

    public String getAttrNameRef() {
        return attrNameRef;
    }

    public void setAttrNameRef(String attrNameRef) {
        this.attrNameRef = attrNameRef;
    }

    public String getAttrValueRef() {
        return attrValueRef;
    }

    public void setAttrValueRef(String attrValueRef) {
        this.attrValueRef = attrValueRef;
    }
}
