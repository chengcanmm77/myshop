package com.bucket.shop.model.order;

/**
 * 订单固化信息
 * @author bucket
 */
public class OrderFixDo {
    private Long    id;
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
