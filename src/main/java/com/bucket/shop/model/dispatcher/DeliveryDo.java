package com.bucket.shop.model.dispatcher;

import java.io.Serializable;
import java.util.Date;

/**
 * @purpose 出库单
 * @description Created by xuzhouwang@qccr.com on 2016/6/22.
 */
public class DeliveryDo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 4399558097436185017L;
    /**
     * 发货通知单id
     */
    private Long              id;
    /**
     * 调度中心唯一编码
     */
    private String            dpUuid;
    /**
     * 发货通知单编号
     */
    private String            noticeNo;
    /**
     * 销售订单号
     */
    private String            orderNo;
    /**
     * 销售订单号id
     */
    private Long              orderId;
    /**
     * 售后单号
     */
    private String            afterSaleNo;
    /**
     * 售后单id
     */
    private Long              afterSaleId;
    /**
     * @see com.qccr.ordercenter.facade.enums.dispatcher.PackageTypeEnum
     */
    private Integer           noticeType;
    /**
     * @see com.qccr.ordercenter.facade.enums.dispatcher.DeliveryStatusEnum
     */
    private Integer           noticeStatus;
    /**
     * 通知时间
     */
    private Date              noticeTime;
    /**
     * 仓库id
     */
    private Long              warehouseId;
    /**
     * 物流id
     */
    private Long              logisticsId;
    /**
     * 省地址编码
     */
    private String            addressProvince;
    /**
     * 省地址名称
     */
    private String            addressProvinceName;
    /**
     * 市编码
     */
    private String            addressCity;
    /**
     * 市名称
     */
    private String            addressCityName;
    /**
     * 区编码
     */
    private String            addressCounty;
    /**
     * 区名称
     */
    private String            addressCountyName;
    /**
     * 详细地址（不包括省,市,区)
     */
    private String            addressDetail;
    /**
     * 收货人名称
     */
    private String            addressContact;
    /**
     * 收货人号码
     */
    private String            addressPhone;
    /**
     * 阿里小号
     */
    private String            virtualPhone;
    /**
     * 客户账号
     */
    private String            customerAccount;
    /**
     * 客户名称
     */
    private String            customerContact;
    /**
     * 客户号码
     */
    private String            customerPhone;
    /**
     * 服务店铺名称
     */
    private String            serviceStore;
    /**
     * 门店联系人名称
     */
    private String            storeContact;
    /**
     * 门店联系人号码
     */
    private String            storePhone;
    /**
     * @see com.qccr.ordercenter.facade.enums.dispatcher.DeliveryUrgentEnum
     */
    private Integer           urgent;
    /**
     * @see com.qccr.ordercenter.facade.enums.dispatcher.DeliverySplitEnum
     */
    private Integer           canSplit;
    /**
     *
     */
    private Integer           install;
    /**
     * 通知单组合类型
     */
    private Integer           combineStatus;
    /**
     * 创建时间
     */
    private Date              createTime;
    /**
     * 更新时间
     */
    private Date              updateTime;
    /**
     * 创建人
     */
    private String            createPerson;
    /**
     * 更新人
     */
    private String            updatePerson;
    /**物流单号**/
    private String            logisticsNo;
    /**
     * 发货时间
     */
    private Date              deliverTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getDpUuid() {
        return dpUuid;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getAfterSaleNo() {
        return afterSaleNo;
    }

    public Long getAfterSaleId() {
        return afterSaleId;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public Long getLogisticsId() {
        return logisticsId;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public String getAddressProvinceName() {
        return addressProvinceName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressCityName() {
        return addressCityName;
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public String getAddressCountyName() {
        return addressCountyName;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public String getAddressContact() {
        return addressContact;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public String getVirtualPhone() {
        return virtualPhone;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getServiceStore() {
        return serviceStore;
    }

    public String getStoreContact() {
        return storeContact;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public Integer getUrgent() {
        return urgent;
    }

    public Integer getCanSplit() {
        return canSplit;
    }

    public Integer getInstall() {
        return install;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDpUuid(String dpUuid) {
        this.dpUuid = dpUuid;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setAfterSaleNo(String afterSaleNo) {
        this.afterSaleNo = afterSaleNo;
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public void setAddressProvinceName(String addressProvinceName) {
        this.addressProvinceName = addressProvinceName;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setAddressCityName(String addressCityName) {
        this.addressCityName = addressCityName;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    public void setAddressCountyName(String addressCountyName) {
        this.addressCountyName = addressCountyName;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public void setAddressContact(String addressContact) {
        this.addressContact = addressContact;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public void setVirtualPhone(String virtualPhone) {
        this.virtualPhone = virtualPhone;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setServiceStore(String serviceStore) {
        this.serviceStore = serviceStore;
    }

    public void setStoreContact(String storeContact) {
        this.storeContact = storeContact;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public void setUrgent(Integer urgent) {
        this.urgent = urgent;
    }

    public void setCanSplit(Integer canSplit) {
        this.canSplit = canSplit;
    }

    public Integer getCombineStatus() {
        return combineStatus;
    }

    public void setCombineStatus(Integer combineStatus) {
        this.combineStatus = combineStatus;
    }

    public void setInstall(Integer install) {
        this.install = install;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

}
