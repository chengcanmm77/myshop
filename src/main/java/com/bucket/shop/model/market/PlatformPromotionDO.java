package com.bucket.shop.model.market;

import java.util.Date;

public class PlatformPromotionDO {

    /** uid  */
    private static final long serialVersionUID = -4301874216916911319L;
    /** 主键id */
    private Integer           id;
    /** 促销活动业务主键ID */
    private Long              promotionId;
    /** 平台补贴（分为单位） */
    private Integer           platformAllowance;
    /** 商家补贴档次（分为单位，多个档次都逗号隔开，例如1,2,3） */
    private String            merchantAllowanceGrade;
    /** 起售数量 */
    private Integer           saleMinNumber;
    /** 省份id集合，逗号开始，逗号结束，例如,2,4, */
    private String            provinceIds;
    /** 城市id集合，逗号开始，逗号结束，例如,20,22, */
    private String            cityIds;
    /** 报名开始时间 */
    private Date              startRegistrationTime;
    /** 报名结束时间 */
    private Date              endRegistrationTime;
    /** 商家报名图片 */
    private String            appEnrollPhoto;
    /** app活动详情url */
    private String            appUrl;
    /** 报名数量 */
    private Integer           applyNumber;
    /** web报名图片 */
    private String            webEnrollPhoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getPlatformAllowance() {
        return platformAllowance;
    }

    public void setPlatformAllowance(Integer platformAllowance) {
        this.platformAllowance = platformAllowance;
    }

    public String getMerchantAllowanceGrade() {
        return merchantAllowanceGrade;
    }

    public void setMerchantAllowanceGrade(String merchantAllowanceGrade) {
        this.merchantAllowanceGrade = merchantAllowanceGrade;
    }

    public Integer getSaleMinNumber() {
        return saleMinNumber;
    }

    public void setSaleMinNumber(Integer saleMinNumber) {
        this.saleMinNumber = saleMinNumber;
    }

    public String getProvinceIds() {
        return provinceIds;
    }

    public void setProvinceIds(String provinceIds) {
        this.provinceIds = provinceIds;
    }

    public String getCityIds() {
        return cityIds;
    }

    public void setCityIds(String cityIds) {
        this.cityIds = cityIds;
    }

    public Date getStartRegistrationTime() {
        return startRegistrationTime;
    }

    public void setStartRegistrationTime(Date startRegistrationTime) {
        this.startRegistrationTime = startRegistrationTime;
    }

    public Date getEndRegistrationTime() {
        return endRegistrationTime;
    }

    public void setEndRegistrationTime(Date endRegistrationTime) {
        this.endRegistrationTime = endRegistrationTime;
    }

    public String getAppEnrollPhoto() {
        return appEnrollPhoto;
    }

    public void setAppEnrollPhoto(String appEnrollPhoto) {
        this.appEnrollPhoto = appEnrollPhoto;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public Integer getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(Integer applyNumber) {
        this.applyNumber = applyNumber;
    }

    public String getWebEnrollPhoto() {
        return webEnrollPhoto;
    }

    public void setWebEnrollPhoto(String webEnrollPhoto) {
        this.webEnrollPhoto = webEnrollPhoto;
    }

}
