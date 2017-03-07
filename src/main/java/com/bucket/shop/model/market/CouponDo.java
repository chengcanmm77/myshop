package com.bucket.shop.model.market;

import java.util.Date;

import com.bucket.shop.model.BaseDo;

/**
 * 优惠券
 * @author user
 *
 */
public class CouponDo extends BaseDo {

    private Long    id;
    /**
     * 名称
     */
    private String  name;

    /**
     * 状态（1.暂停 2.上线 3.过期 4.下线、5.待审核 6.审核不通过 7.已删除）
     */
    private Integer status;

    /**
     * 显示类型（1-美容 2-洗车 3-通用）
     */
    private Integer showType;

    /**
     * 适用的订单类型
     */
    private Integer applyOrderType;

    /**
     * 适用类型 1.类目 2.商品 3.商家 4.时间段内限次
     */
    private Integer applyType;

    /**
     * 适用定义 1.类目(1_1(1_表示商品 类目；2_表示服务类目)) 2.商品 3.商家 4.1_1_2（1每月2每周3每日4每小时）_可领次数_service_id 
     */
    private String  applyDefine;

    /**
     * 优惠类型 1.固定减 2.随机减 3.固定成交 4.按订单固定减（主要是兼容保养套餐）
     */
    private Integer offType;

    /**
     * 优惠定义 1.金额 2.金额区间(5.00~10.00) 3.金额 4.金额
     */
    private String  offDefine;

    /**
     * 有效期类型 1.绝对时间 2.相对时间
     */
    private Integer validType;

    /**
     * 有效期的值，与validType同时使用。1.  2015-06-01 00:00:00~2015-07-01 00:00:00 2. 720(单位：小时)
     */
    private String  validDefine;
    /**
     * 使用规则描述。如：仅限洗车、打蜡、内饰清洗使用
     */
    private String  ruleDesc;

    /**
     * 是否进行短信通知、0、不通知、1、通知
     */
    private Integer isSms;

    /**
     * 短信模板
     */
    private String  smsTemplet;

    /**
     * 审核人
     */
    private String  checkOperator;

    /**
     * 审核时间
     */
    private Date    checkDate;

    /**
     * 审核备注
     */
    private String  checkRemark;

    /**
     * 优惠券适用用的省编号（冗余数据）
     */
    private Integer provinceId;

    /**
     * 优惠券适用用的市编号（冗余数据）
     */
    private Integer cityId;

    /**
     * 起用金额(允许使用该折扣券的订单最低金额,空表示所有订单可用)兑换券无该字段
     */
    private Double  enableAmount;

    /**
     * 标签 1-新用户 2-定时 3-服务 4-商品
     */
    private String  label;

    /**
     * 可用渠道 1-通用 2-App
     */
    private Integer validWay;

    /**
     * 是否启用频次限制。0-不启用，1-启用
     */
    private Integer enableFreqLimit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public Integer getApplyOrderType() {
        return applyOrderType;
    }

    public void setApplyOrderType(Integer applyOrderType) {
        this.applyOrderType = applyOrderType;
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public String getApplyDefine() {
        return applyDefine;
    }

    public void setApplyDefine(String applyDefine) {
        this.applyDefine = applyDefine;
    }

    public Integer getOffType() {
        return offType;
    }

    public void setOffType(Integer offType) {
        this.offType = offType;
    }

    public String getOffDefine() {
        return offDefine;
    }

    public void setOffDefine(String offDefine) {
        this.offDefine = offDefine;
    }

    public Integer getValidType() {
        return validType;
    }

    public void setValidType(Integer validType) {
        this.validType = validType;
    }

    public String getValidDefine() {
        return validDefine;
    }

    public void setValidDefine(String validDefine) {
        this.validDefine = validDefine;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public Integer getIsSms() {
        return isSms;
    }

    public void setIsSms(Integer isSms) {
        this.isSms = isSms;
    }

    public String getSmsTemplet() {
        return smsTemplet;
    }

    public void setSmsTemplet(String smsTemplet) {
        this.smsTemplet = smsTemplet;
    }

    public String getCheckOperator() {
        return checkOperator;
    }

    public void setCheckOperator(String checkOperator) {
        this.checkOperator = checkOperator;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Double getEnableAmount() {
        return enableAmount;
    }

    public void setEnableAmount(Double enableAmount) {
        this.enableAmount = enableAmount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getValidWay() {
        return validWay;
    }

    public void setValidWay(Integer validWay) {
        this.validWay = validWay;
    }

    public Integer getEnableFreqLimit() {
        return enableFreqLimit;
    }

    public void setEnableFreqLimit(Integer enableFreqLimit) {
        this.enableFreqLimit = enableFreqLimit;
    }

}
