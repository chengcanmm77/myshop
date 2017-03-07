package com.bucket.shop.model.member;

import java.util.Date;

import com.bucket.shop.model.BaseDo;

public class UserCouponDO extends BaseDo {

    /**
     * 编号
     */
    private Long    id;

    /**
     * 线下发券先建记录后关联
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String  userName;

    /**
     * 优惠券编号
     */
    private Integer couponId;

    /**
     * 优惠券名称（与coupon中的name一致）
     */
    private String  name;

    /**
     * 1-美容 3-保养 10-商品
     */
    private Integer showType;

    /**
     * 优惠金额
     */
    private Double  money;

    /**
     * 状态：1.未用 2.已用 3.过期
     */
    private Integer status;

    /**
     * 可以使用的开始时间
     */
    private Date    beginTime;

    /**
     * 可以使用的最后时间
     */
    private Date    deadline;

    /**
     * 领取时间
     */
    private Date    getTime;

    /**
     * 优惠券获取时的批次编号
     */
    private Long    getBatchId;

    /**
     * 领用设备的IMEI
     */
    private String  imei;

    /**
     * 优惠券的代码
     */
    private String  code;

    /**
     * 渠道{1.用户版app；2.用户版web；3.商户版app;4.商户版web}
     */
    private Integer channel;

    /**
     * 优惠券使用时间
     */
    private Date    applyTime;

    /**
     * coupon表中的字段, 适用的订单类型 
     */
    private Integer applyOrderType;

    /**
     * coupon表中的字段 
     */
    private Integer applyType;

    /**
     * coupon表中的字段 
     */
    private String  applyDefine;

    /**
     * coupon表中的字段
     */
    private String  ruleDesc;

    /**
     * 优惠券起用金额
     */
    private Double  enableAmount;

    /**
     * 优惠券使用时间 
     */
    private Date    useTime;

    /**
     * 优惠券使用的订单编号
     */
    private String  useOrderNo;

    /**
     * 优惠类型 1.固定减 2.随机减 3.固定成交 4.按订单固定减（主要是兼容保养套餐）
     */
    private Integer offType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Long getGetBatchId() {
        return getBatchId;
    }

    public void setGetBatchId(Long getBatchId) {
        this.getBatchId = getBatchId;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
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

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public Double getEnableAmount() {
        return enableAmount;
    }

    public void setEnableAmount(Double enableAmount) {
        this.enableAmount = enableAmount;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public String getUseOrderNo() {
        return useOrderNo;
    }

    public void setUseOrderNo(String useOrderNo) {
        this.useOrderNo = useOrderNo;
    }

    public Integer getOffType() {
        return offType;
    }

    public void setOffType(Integer offType) {
        this.offType = offType;
    }

}
