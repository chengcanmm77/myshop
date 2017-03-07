package com.bucket.shop.model.aftersale;

import com.bucket.shop.model.BaseDo;

public class AfterSaleDetail extends BaseDo {

    /** 记录ld */
    private Long    id;
    /** 售后Id */
    private Long    afterSaleId;
    /** 订单Id */
    private Long    orderId;
    /** 商品或服务订单Id */
    private Long    orderGoodsId;
    /**spu的id*/
    private Long    goodsSpuId;
    /** sku售后数量 */
    private Integer refundNum    = 0;
    /** 售后金额 */
    private Double  refundSum;
    /**
     * 已通知发货数量：
     *   1. 当客服通知时，修改通知发货数量
     */
    private Integer noticeNum;

    /** 商品标识  1：商品  2：服务 */
    private Integer goodsFlag;
    /**售后状态*/
    private Integer status;
    /**spu名称*/
    private String  spuName;
    /**赠品的商品ID*/
    private Long    giftOgid;
    /**1：商品赠送，2：活动赠送，3：售后赠送**/
    private Integer giftType;
    /**spuNo*/
    private String  spuNo;
    /**spu销售价格*/
    private Double  spuSaleCost;
    /**订单SKU id*/
    private Long    orderSkuId;
    /**sku的id*/
    private Long    goodsSkuId;
    /**订单SKU 名称*/
    private String  skuName;
    /**SKU编码*/
    private String  skuNo;
    /**sku销售价格*/
    private Double  skuSaleCost;
    /**换货赠品标记*/
    private Boolean afterGiftFlag;
    /**商品损耗数量*/
    private Integer goodsLossNum = 0;
    /**用户ID*/
    private Long    userId;
    /** 倍数 */
    private Integer skuCount;
    /** spu下单数量*/
    private Integer spuSaleNum;

    /****** 扩充字段 ******/
    /** 第三方商品Id */
    private Long    goodsThirdId;

    /** 商品Id */
    private Long    goodsId;

    /** 错发的sku的json体 */
    private String  wrongSku;
    /**图片*/
    private String  img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAfterSaleId() {
        return afterSaleId;
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Long getGoodsSpuId() {
        return goodsSpuId;
    }

    public void setGoodsSpuId(Long goodsSpuId) {
        this.goodsSpuId = goodsSpuId;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public Double getRefundSum() {
        return refundSum;
    }

    public void setRefundSum(Double refundSum) {
        this.refundSum = refundSum;
    }

    public Integer getNoticeNum() {
        return noticeNum;
    }

    public void setNoticeNum(Integer noticeNum) {
        this.noticeNum = noticeNum;
    }

    public Integer getGoodsFlag() {
        return goodsFlag;
    }

    public void setGoodsFlag(Integer goodsFlag) {
        this.goodsFlag = goodsFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public Long getGiftOgid() {
        return giftOgid;
    }

    public void setGiftOgid(Long giftOgid) {
        this.giftOgid = giftOgid;
    }

    public Integer getGiftType() {
        return giftType;
    }

    public void setGiftType(Integer giftType) {
        this.giftType = giftType;
    }

    public String getSpuNo() {
        return spuNo;
    }

    public void setSpuNo(String spuNo) {
        this.spuNo = spuNo;
    }

    public Double getSpuSaleCost() {
        return spuSaleCost;
    }

    public void setSpuSaleCost(Double spuSaleCost) {
        this.spuSaleCost = spuSaleCost;
    }

    public Long getOrderSkuId() {
        return orderSkuId;
    }

    public void setOrderSkuId(Long orderSkuId) {
        this.orderSkuId = orderSkuId;
    }

    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public Double getSkuSaleCost() {
        return skuSaleCost;
    }

    public void setSkuSaleCost(Double skuSaleCost) {
        this.skuSaleCost = skuSaleCost;
    }

    public Boolean getAfterGiftFlag() {
        return afterGiftFlag;
    }

    public void setAfterGiftFlag(Boolean afterGiftFlag) {
        this.afterGiftFlag = afterGiftFlag;
    }

    public Integer getGoodsLossNum() {
        return goodsLossNum;
    }

    public void setGoodsLossNum(Integer goodsLossNum) {
        this.goodsLossNum = goodsLossNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public Integer getSpuSaleNum() {
        return spuSaleNum;
    }

    public void setSpuSaleNum(Integer spuSaleNum) {
        this.spuSaleNum = spuSaleNum;
    }

    public Long getGoodsThirdId() {
        return goodsThirdId;
    }

    public void setGoodsThirdId(Long goodsThirdId) {
        this.goodsThirdId = goodsThirdId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getWrongSku() {
        return wrongSku;
    }

    public void setWrongSku(String wrongSku) {
        this.wrongSku = wrongSku;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
