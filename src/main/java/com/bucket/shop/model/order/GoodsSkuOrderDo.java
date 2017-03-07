package com.bucket.shop.model.order;

import com.bucket.shop.model.BaseDo;

public class GoodsSkuOrderDo extends BaseDo {

    private Long    id;

    /** 订单ID */
    private String  orderId;

    /** 商品订单ID*/
    private String  goodsOrderId;

    /** 商品ID */
    private String  goodsId;

    /** 商品skuID */
    private String  goodsSkuId;

    /** 商品 no */
    private String  goodsNo;

    /** 商品sku no */
    private String  goodsSkuNo;

    /** 商品spu */
    private String  goodsSpuNo;

    /** 商品名称 */
    private String  goodsName;

    /** 商品名称 */
    private String  skuName;

    /** 商品类别 */
    private String  goodCategoryId;

    /**商品编码 */
    private String  goodCategoryCode;

    /** 商品类别名称*/
    private String  goodCategoryName;

    /** sku 成本价*/
    private Integer costPrice;

    /** 原sku单价*/
    private Integer originalCost;

    /** sku 销售单价*/
    private Integer saleCost;

    /**是否使用优惠标识 0未使用优惠券 1使用优惠券*/
    private Integer useCoupon;

    /**优惠券分摊金额*/
    private Integer couponApportion = 0;

    /** 销售数量*/
    private Integer saleNum;

    /** 倍数 */
    private Integer skuCount;

    /** 退换货数量 */
    private Integer refundNum       = 0;
    /** 换货数量 */
    private Integer changeNum       = 0;

    /**
     * 通知发货数量
     *      1. 客服通知发货，就进行通知发货数量处理
     */
    private Integer noticeNum       = 0;

    /** 计量单位  */
    private String  unit;

    /** 重量  */
    private Double  weight;

    /** 状态 */
    private String  status;

    /** 商品图片URL */
    private String  img;

    /** 赠品关联 ordergoodsId **/
    private Long    giftOgid;

    /**商品损耗数量 **/
    private Integer goodsLossNum;

    /** 添加赠品标记**/
    private Integer afterGiftFlag   = 0;

    /** 当次申请退换货的数量,临时存放，不需要存到库中 */
    private Integer applyRefundNum;

    /**1：商品赠送，2：活动赠送，3：售后赠送**/
    private Integer giftType;

    private String  giftTypeName;

    /** 未通知发货数量* */
    private Integer nonNoticeNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsOrderId() {
        return goodsOrderId;
    }

    public void setGoodsOrderId(String goodsOrderId) {
        this.goodsOrderId = goodsOrderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(String goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsSkuNo() {
        return goodsSkuNo;
    }

    public void setGoodsSkuNo(String goodsSkuNo) {
        this.goodsSkuNo = goodsSkuNo;
    }

    public String getGoodsSpuNo() {
        return goodsSpuNo;
    }

    public void setGoodsSpuNo(String goodsSpuNo) {
        this.goodsSpuNo = goodsSpuNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getGoodCategoryId() {
        return goodCategoryId;
    }

    public void setGoodCategoryId(String goodCategoryId) {
        this.goodCategoryId = goodCategoryId;
    }

    public String getGoodCategoryCode() {
        return goodCategoryCode;
    }

    public void setGoodCategoryCode(String goodCategoryCode) {
        this.goodCategoryCode = goodCategoryCode;
    }

    public String getGoodCategoryName() {
        return goodCategoryName;
    }

    public void setGoodCategoryName(String goodCategoryName) {
        this.goodCategoryName = goodCategoryName;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(Integer originalCost) {
        this.originalCost = originalCost;
    }

    public Integer getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(Integer saleCost) {
        this.saleCost = saleCost;
    }

    public Integer getUseCoupon() {
        return useCoupon;
    }

    public void setUseCoupon(Integer useCoupon) {
        this.useCoupon = useCoupon;
    }

    public Integer getCouponApportion() {
        return couponApportion;
    }

    public void setCouponApportion(Integer couponApportion) {
        this.couponApportion = couponApportion;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public Integer getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
    }

    public Integer getNoticeNum() {
        return noticeNum;
    }

    public void setNoticeNum(Integer noticeNum) {
        this.noticeNum = noticeNum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getGiftOgid() {
        return giftOgid;
    }

    public void setGiftOgid(Long giftOgid) {
        this.giftOgid = giftOgid;
    }

    public Integer getGoodsLossNum() {
        return goodsLossNum;
    }

    public void setGoodsLossNum(Integer goodsLossNum) {
        this.goodsLossNum = goodsLossNum;
    }

    public Integer getAfterGiftFlag() {
        return afterGiftFlag;
    }

    public void setAfterGiftFlag(Integer afterGiftFlag) {
        this.afterGiftFlag = afterGiftFlag;
    }

    public Integer getApplyRefundNum() {
        return applyRefundNum;
    }

    public void setApplyRefundNum(Integer applyRefundNum) {
        this.applyRefundNum = applyRefundNum;
    }

    public Integer getGiftType() {
        return giftType;
    }

    public void setGiftType(Integer giftType) {
        this.giftType = giftType;
    }

    public String getGiftTypeName() {
        return giftTypeName;
    }

    public void setGiftTypeName(String giftTypeName) {
        this.giftTypeName = giftTypeName;
    }

    public Integer getNonNoticeNum() {
        return nonNoticeNum;
    }

    public void setNonNoticeNum(Integer nonNoticeNum) {
        this.nonNoticeNum = nonNoticeNum;
    }

}
