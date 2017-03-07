package com.bucket.shop.model.trade;

import java.util.Date;

import com.bucket.shop.model.BaseDo;

/**
 * 交易订单
 * @author bucket
 */
public class TradeDo extends BaseDo {

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
    /** 经度 */
    private String  lon;
    /** 纬度 */
    private String  lat;
    /** 物流费用 以分为单位 */
    private Integer logisticsPrice;
    /** 下单地址-省 */
    private String  receiverProvinceId;
    /** 下单地址-市 */
    private String  receiverCityId;
    /** 下单地址-区、县 */
    private String  receiverCountyId;
    /** 下单地址详情 */
    private String  receiverDetail;
    /** 下单地址联系人 */
    private String  receiverName;
    /** 下单地址手机号 */
    private String  receiverPhone;
    /** 座机 */
    private String  telephone;
    /** 优惠券名称 */
    private String  couponName;
    /** 优惠券类型 */
    private String  couponType;
    /** 优惠券金额 */
    private Integer couponCost;
    /** 优惠券实际优惠金额 */
    private Integer couponRealCost;

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

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getLogisticsPrice() {
        return logisticsPrice;
    }

    public void setLogisticsPrice(Integer logisticsPrice) {
        this.logisticsPrice = logisticsPrice;
    }

    public String getReceiverProvinceId() {
        return receiverProvinceId;
    }

    public void setReceiverProvinceId(String receiverProvinceId) {
        this.receiverProvinceId = receiverProvinceId;
    }

    public String getReceiverCityId() {
        return receiverCityId;
    }

    public void setReceiverCityId(String receiverCityId) {
        this.receiverCityId = receiverCityId;
    }

    public String getReceiverCountyId() {
        return receiverCountyId;
    }

    public void setReceiverCountyId(String receiverCountyId) {
        this.receiverCountyId = receiverCountyId;
    }

    public String getReceiverDetail() {
        return receiverDetail;
    }

    public void setReceiverDetail(String receiverDetail) {
        this.receiverDetail = receiverDetail;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Integer getCouponCost() {
        return couponCost;
    }

    public void setCouponCost(Integer couponCost) {
        this.couponCost = couponCost;
    }

    public Integer getCouponRealCost() {
        return couponRealCost;
    }

    public void setCouponRealCost(Integer couponRealCost) {
        this.couponRealCost = couponRealCost;
    }

}
