package com.bucket.shop.common.vo.item.attribute;

import com.bucket.shop.common.vo.BaseVo;

public class AttributeNameVo extends BaseVo {

    /**  */
    private static final long serialVersionUID = 1L;

    /**
     * 属性名ID
     */
    private Integer           attrNameId;

    /**
     * 属性名称
     */
    private String            attrName;

    /**
     * 所属类目ID,叶子类目
     */
    private Integer           categoryId;

    /**
     * 排序
     */
    private Integer           attrOrder;
    /**
     * 属性类型:1.关键属性 2.非关键属性 3.销售属性
     */
    private Integer           attrType;

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

    public Boolean getIsFrontShow() {
        return isFrontShow;
    }

    public void setIsFrontShow(Boolean isFrontShow) {
        this.isFrontShow = isFrontShow;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAttrOrder() {
        return attrOrder;
    }

    public void setAttrOrder(Integer attrOrder) {
        this.attrOrder = attrOrder;
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

    public Integer getAttrType() {
        return attrType;
    }

    public void setAttrType(Integer attrType) {
        this.attrType = attrType;
    }
}
