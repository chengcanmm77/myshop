package com.bucket.shop.model.dbo.order;

import java.util.Date;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 主订单信息
 * @author user
 *
 */
public class OrderDo extends BaseDo {

    private Long    id;

    private String  orderNo;

    private Long    userId;

    private Integer type;

    private Long    addressId;

    private Long    couponId;

    private Integer Source;

    private String  channel;

    private Integer status;

    /** 支付单号 */
    private String  payNo;
    /** 支付类型 */
    private String  payType;
    /** 支付账户 */
    private String  payAccount;
    /** 支付时间 */
    private Date    payTime;
    /** 支付流水号 */
    private String  billNo;
    /** 配送到店 */
    private Integer sendType;
    /** 市场价 以分为单位 */
    private Integer marketPrice;
    /** 原价 以分为单位 */
    private Integer originalPrice;
    /** 销售价 以分为单位 */
    private Integer salePrice;
    /** 实付价 以分为单位 */
    private Integer realPrice;
    /** 买家名称 */
    private String  buyerName;
    /** 买家电话 */
    private String  buyerPhone;
    /** 买家留言 */
    private String  buyerNote;
    /** 卖家留言 */
    private String  sellerNote;
    /** 物流费用 以分为单位 */
    private Integer logisticsPrice;
    /** 优惠券金额 */
    private Integer couponCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Integer getSource() {
        return Source;
    }

    public void setSource(Integer source) {
        Source = source;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
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

    public Integer getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Integer realPrice) {
        this.realPrice = realPrice;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerNote() {
        return buyerNote;
    }

    public void setBuyerNote(String buyerNote) {
        this.buyerNote = buyerNote;
    }

    public String getSellerNote() {
        return sellerNote;
    }

    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    public Integer getLogisticsPrice() {
        return logisticsPrice;
    }

    public void setLogisticsPrice(Integer logisticsPrice) {
        this.logisticsPrice = logisticsPrice;
    }

    public Integer getCouponCost() {
        return couponCost;
    }

    public void setCouponCost(Integer couponCost) {
        this.couponCost = couponCost;
    }

}
