/**
 * qccr.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.bucket.shop.common.vo.item.sku;

import com.bucket.shop.common.vo.BaseVo;

/**
 * SKU图片表
 */
public class SkuImageVo extends BaseVo {
    /**  */
    private static final long serialVersionUID = 7099033683389324463L;
    /**
     * SKU图片ID
     */
    private Integer           skuImageId;
    /**
     * SKU商品ID
     */
    private Integer           skuId;
    /**
     * 图片类型 1 sku商品图片 2 包装图片
     */
    private Integer           type;
    /**
     * SKU图片URL
     */
    private String            imageUrl;
    /**
     * SKU图片标题
     */
    private String            title;
    /**
     * SKU图片排序
     */
    private Integer           imgOrder;
    /**
     * 原图
     */
    private String            original;
    /**
     * 大图
     */
    private String            large;
    /**
     * 中图
     */
    private String            medium;
    /**
     * 小图
     */
    private String            thumbnail;

    public Integer getSkuImageId() {
        return skuImageId;
    }

    public void setSkuImageId(Integer skuImageId) {
        this.skuImageId = skuImageId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImgOrder() {
        return imgOrder;
    }

    public void setImgOrder(Integer imgOrder) {
        this.imgOrder = imgOrder;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return String.format(
            "SkuImageDO [skuImageId=%s, skuId=%s, type=%s, imageUrl=%s, title=%s, imageOrder=%s, original=%s, large=%s, medium=%s, thumbnail=%s]",
            skuImageId, skuId, type, imageUrl, title, imgOrder, original, large, medium, thumbnail);
    }

}
