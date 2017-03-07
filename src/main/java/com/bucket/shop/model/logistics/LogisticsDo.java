package com.bucket.shop.model.logistics;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.BaseDo;

/**
 * 
 * @author 庞健松 ~ 2015-4-16 下午09:05:41
 */
@Alias(value = "LogisticsDo")
public class LogisticsDo extends BaseDo {

    private Long      id;
    /** 关联订单id */
    private Long      orderId;
    /** 类型 '1、物流 2、快递 3、ems' */
    private Integer   type;
    /** 物流费用 */
    private Double    cost;
    /** 用户支付费用 */
    private Double    userCost;
    /** 物流公司 */
    private String    company;
    /** 物流公司编码 */
    private String    companyCode;
    /** 快递单号 */
    private String    no;
    /** 对应三方物流公司编码 */
    private String    thirdCompanyCode;

    /**
     * 物流详情
     */
    private String    detail;
    /** 系统打包进度信息 */
    private String    systemDetail;
    /**
     * 最近物流信息时间
     */
    private String    date;
    /**
     * 最近物流详情
     */
    private String    logisticsDetail;
    /**
     * 监控状态:polling:监控中，shutdown:结束，abort:中止，updateall：重新推送。其中当快递单为已签收时status=shutdown，当message为“3天查询无记录”或“60天无变化时”status= abort
     */
    private String    status;
    /** 监控状态相关消息，如:3天查询无记录，60天无变化 */
    private String    message;
    /**
     * 快递单当前签收状态，包括0在途中、1已揽收、2疑难、3已签收、4退签、5同城派送中、6退回、7转单等7个状态
     */
    private Integer   state;
    /** 是否签收标记 */
    private Integer   isCheck;
    /** 用户ID */
    private Integer   userId;
    /** 创建人 */
    private String    createPerson;
    /** 修改人 */
    private String    updatePerson;
    /** 物流签收时间 */
    private Timestamp logisticsCheckTime;
    /** 用户签收时间 */
    private Timestamp userCheckTime;
    /** 订阅状态 */
    private Integer   subscribeStatus;
    /** 订阅成功时间 */
    private Timestamp subscribeSuccessTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getUserCost() {
        return userCost;
    }

    public void setUserCost(Double userCost) {
        this.userCost = userCost;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLogisticsDetail() {
        return logisticsDetail;
    }

    public void setLogisticsDetail(String logisticsDetail) {
        this.logisticsDetail = logisticsDetail;
    }

    public String getSystemDetail() {
        return systemDetail;
    }

    public void setSystemDetail(String systemDetail) {
        this.systemDetail = systemDetail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Timestamp getLogisticsCheckTime() {
        return logisticsCheckTime;
    }

    public void setLogisticsCheckTime(Timestamp logisticsCheckTime) {
        this.logisticsCheckTime = logisticsCheckTime;
    }

    public Timestamp getUserCheckTime() {
        return userCheckTime;
    }

    public void setUserCheckTime(Timestamp userCheckTime) {
        this.userCheckTime = userCheckTime;
    }

    public Integer getSubscribeStatus() {
        return subscribeStatus;
    }

    public void setSubscribeStatus(Integer subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }

    public Timestamp getSubscribeSuccessTime() {
        return subscribeSuccessTime;
    }

    public void setSubscribeSuccessTime(Timestamp subscribeSuccessTime) {
        this.subscribeSuccessTime = subscribeSuccessTime;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getThirdCompanyCode() {
        return thirdCompanyCode;
    }

    public void setThirdCompanyCode(String thirdCompanyCode) {
        this.thirdCompanyCode = thirdCompanyCode;
    }

    @Override
    public String toString() {
        return "LogisticsDo [id=" + id + ", orderId=" + orderId + ", type=" + type + ", cost="
               + cost + ", userCost=" + userCost + ", company=" + company + ", no=" + no
               + ", detail=" + detail + ", date=" + date + ", logisticsDetail=" + logisticsDetail
               + "]";
    }

}
