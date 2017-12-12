/**
 * qccr.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.bucket.shop.model.dbo.goods;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 商品图片
 */
public class ItemImageDo extends BaseDo {

    /** 主键   */
    private Integer itemImageId;

    /** 商品id */
    private Integer itemId;

    /** 图片类型  1-主图 2-中图 3-大图   */
    private Integer type;

    /** 商品图片URL */
    private String  picUrl;

    /** 商品图片名称   */
    private String  title;

    /** 商品图片排序   */
    private Integer imgOrder;

    /** 原图   */
    private String  original;

    /** 大图   */
    private String  large;

    /** 中图  */
    private String  medium;

    /** 小图  */
    private String  thumbnail;

    /**
     * Getter method for property <tt>itemImageId</tt>.
     * 
     * @return property value of itemImageId
     */
    public Integer getItemImageId() {
        return itemImageId;
    }

    /**
     * Setter method for property <tt>itemImageId</tt>.
     * 
     * @param itemImageId value to be assigned to property itemImageId
     */
    public void setItemImageId(Integer itemImageId) {
        this.itemImageId = itemImageId;
    }

    /**
     * Getter method for property <tt>itemId</tt>.
     * 
     * @return property value of itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Setter method for property <tt>itemId</tt>.
     * 
     * @param itemId value to be assigned to property itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * Getter method for property <tt>type</tt>.
     * 
     * @return property value of type
     */
    public Integer getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     * 
     * @param type value to be assigned to property type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * Getter method for property <tt>title</tt>.
     * 
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     * 
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>imgOrder</tt>.
     * 
     * @return property value of imgOrder
     */
    public Integer getImgOrder() {
        return imgOrder;
    }

    /**
     * Setter method for property <tt>imgOrder</tt>.
     * 
     * @param imgOrder value to be assigned to property imgOrder
     */
    public void setImgOrder(Integer imgOrder) {
        this.imgOrder = imgOrder;
    }

    /**
     * Getter method for property <tt>original</tt>.
     * 
     * @return property value of original
     */
    public String getOriginal() {
        return original;
    }

    /**
     * Setter method for property <tt>original</tt>.
     * 
     * @param original value to be assigned to property original
     */
    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * Getter method for property <tt>large</tt>.
     * 
     * @return property value of large
     */
    public String getLarge() {
        return large;
    }

    /**
     * Setter method for property <tt>large</tt>.
     * 
     * @param large value to be assigned to property large
     */
    public void setLarge(String large) {
        this.large = large;
    }

    /**
     * Getter method for property <tt>medium</tt>.
     * 
     * @return property value of medium
     */
    public String getMedium() {
        return medium;
    }

    /**
     * Setter method for property <tt>medium</tt>.
     * 
     * @param medium value to be assigned to property medium
     */
    public void setMedium(String medium) {
        this.medium = medium;
    }

    /**
     * Getter method for property <tt>thumbnail</tt>.
     * 
     * @return property value of thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Setter method for property <tt>thumbnail</tt>.
     * 
     * @param thumbnail value to be assigned to property thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
