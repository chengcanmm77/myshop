package com.bucket.shop.common.vo.item.attribute;

import com.bucket.shop.common.vo.BaseVo;

public class AttributeValueVo extends BaseVo {

    /**  */
    private static final long serialVersionUID = -3495294405098512049L;

    /**
     * 属性值ID
     */
    private Integer           attrValueId;

    /**
     * 属性名ID
     */
    private Integer           attrNameId;

    /**
     * 属性值
     */
    private String            attrValue;

    /**
     * 状态 0 删除 1 禁用  2 使用
     */
    private Integer           status;

    public Integer getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Integer getAttrNameId() {
        return attrNameId;
    }

    public void setAttrNameId(Integer attrNameId) {
        this.attrNameId = attrNameId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
