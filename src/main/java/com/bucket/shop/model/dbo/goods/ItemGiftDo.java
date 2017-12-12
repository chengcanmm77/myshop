/**
 * qccr.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.bucket.shop.model.dbo.goods;

/**
 * 商品赠品管理表
 * 
 */
public class ItemGiftDo {

    /**主键id*/
    private Integer itemGiftId;

    /**商品id*/
    private Integer itemId;

    /**赠品 id*/
    private Integer giftId;
    /**赠品数量*/
    private Integer giftNum;

    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    /**
     * Getter method for property <tt>itemGiftId</tt>.
     * 
     * @return property value of itemGiftId
     */
    public Integer getItemGiftId() {
        return itemGiftId;
    }

    /**
     * Setter method for property <tt>itemGiftId</tt>.
     * 
     * @param itemGiftId value to be assigned to property itemGiftId
     */
    public void setItemGiftId(Integer itemGiftId) {
        this.itemGiftId = itemGiftId;
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
     * Getter method for property <tt>giftId</tt>.
     * 
     * @return property value of giftId
     */
    public Integer getGiftId() {
        return giftId;
    }

    /**
     * Setter method for property <tt>giftId</tt>.
     * 
     * @param giftId value to be assigned to property giftId
     */
    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }
}
