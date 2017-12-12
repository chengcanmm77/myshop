package com.bucket.shop.model.dbo.trade;

import com.bucket.shop.model.dbo.BaseDo;

public class TradeGoodsDo extends BaseDo {

    private Long    id;

    private Long    tradeId;

    private Long    itemId;

    private String  itemCode;

    /** 商品名称 */
    private String  itemName;

    private Long    brandId;
    /** sku编码 */
    private String  skuCode;

    private Integer marketPrice;
    /** 原价 以分为单位 */
    private Integer originalPrice;
    /** 销售价 以分为单位 */
    private Integer salePrice;
    /** 销售数量 */
    private Integer saleNum;

    private Integer status;

    private Integer refundNum;

    /** 退货金额 以分为单位 */
    private Long    refundSum;

    /** 图片 */
    private String  img;

    /** 商品分类id */
    private String  categoryId;

    /** 是否使用优惠标识 0未使用优惠券 1使用优惠券 */
    private Integer useCoupon;

    /** 重量 */
    private Integer weight;

    /** 营销活动id */
    private String  promotionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public Long getRefundSum() {
        return refundSum;
    }

    public void setRefundSum(Long refundSum) {
        this.refundSum = refundSum;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUseCoupon() {
        return useCoupon;
    }

    public void setUseCoupon(Integer useCoupon) {
        this.useCoupon = useCoupon;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

}
