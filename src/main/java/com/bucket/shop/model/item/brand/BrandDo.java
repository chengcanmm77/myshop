/**
 * qccr.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.bucket.shop.model.item.brand;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bucket.shop.model.BaseDo;

/**
 * 品牌
 * 
 */
public class BrandDo extends BaseDo {
    /**
     * 品牌ID 主键
     */
    private Integer brandId;
    /**
     * 品牌名称
     */
    private String  brandName;
    /**
     * 品牌编码
     */
    private String  brandCode;
    /**
     * 品牌logo
     */
    private String  brandLogo;
    /**
     * 状态 0 删除 1启用 2禁用
     */
    private Integer status;
    /**
     * 品牌描述
     */
    private String  introduction;
    /**
     * 品牌排序
     */
    private Integer brandOrder;
    /**
     * 归属地
     */
    private String  attribution;
    /**
     * 类目ID
     */
    private Integer categoryId;
    /**
     * 类目名称
     */
    private String  categoryName;
    /**
     * 类目IDS
     */
    private String  categoryIds;
    /**
     * 类目编码 逗号隔开，一个品牌可关联多个编码
     */
    private String  categoryCodes;

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

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getBrandOrder() {
        return brandOrder;
    }

    public void setBrandOrder(Integer brandOrder) {
        this.brandOrder = brandOrder;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
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

    public String getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getCategoryCodes() {
        return categoryCodes;
    }

    public void setCategoryCodes(String categoryCodes) {
        this.categoryCodes = categoryCodes;
    }
}
