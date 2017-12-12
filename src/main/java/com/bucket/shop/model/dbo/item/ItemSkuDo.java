package com.bucket.shop.model.dbo.item;

import com.bucket.shop.model.dbo.BaseDo;

public class ItemSkuDo extends BaseDo {

    /**主键id*/
    private Integer itemId;

    /**SKU id*/
    private Integer skuId;

    /**SPU 编码*/
    private String  spuNO;

    /**是否是主商品*/
    private Boolean isMain;

    /** 商品类型 1 单个SKU 2 多个SKU*/
    private Integer itemType;

    /** 可售卖数量*/
    private Integer saleCount;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSpuNO() {
        return spuNO;
    }

    public void setSpuNO(String spuNO) {
        this.spuNO = spuNO;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

}
