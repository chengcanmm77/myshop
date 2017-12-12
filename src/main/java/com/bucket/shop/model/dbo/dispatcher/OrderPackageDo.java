package com.bucket.shop.model.dbo.dispatcher;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * @purpose 包裹单实体
 * @description Created by xuzhouwang@qccr.com on 2016/6/22.
 */
@Alias("orderPackageDo")
public class OrderPackageDo extends BaseDo {

    /**
     * 
     */
    private static final long serialVersionUID = -60980266894841343L;

    private Long              id;                                    //包裹id;
    private String            packageNo;                             //包裹单号
    private Integer           packageType;                           //包裹类型
    private String            noticeNo;                              //发货通知单单号
    private Long              noticeId;                              //发货通知单id
    private String            orderNo;                               //销售订单号
    private Long              orderId;                               //销售订单号id
    private String            afterSaleNo;                           //售后单号
    private Long              afterSaleId;                           //售后id
    private Long              warehouseId;                           //仓库id;
    private String            warehouseName;                         //仓库名称
    private Long              logisticsId;                           //物流id;
    private String            logisticsCompany;                      //物流公司名称
    private String            logisticsNo;                           //物流单号
    private Date              deliveryTime;                          //出库时间
    private Integer           isPackage;                             //是否拆包裹 true：拆 false：不拆
    private Date              createTime;                            //创建时间
    private String            createPerson;                          //创建人
    private Date              updateTime;                            //更新时间
    private String            updatePerson;                          //更新人

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getAfterSaleNo() {
        return afterSaleNo;
    }

    public void setAfterSaleNo(String afterSaleNo) {
        this.afterSaleNo = afterSaleNo;
    }

    public Long getAfterSaleId() {
        return afterSaleId;
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Long getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Integer getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Integer isPackage) {
        this.isPackage = isPackage;
    }

    @Override
    public String toString() {
        return "OrderPackageDo{" + "id=" + id + ", packageNo='" + packageNo + '\''
               + ", packageType=" + packageType + ", noticeNo='" + noticeNo + '\'' + ", noticeId="
               + noticeId + ", orderNo='" + orderNo + '\'' + ", orderId=" + orderId
               + ", afterSaleNo='" + afterSaleNo + '\'' + ", afterSaleId=" + afterSaleId
               + ", warehouseId=" + warehouseId + ", warehouseName='" + warehouseName + '\''
               + ", logisticsId=" + logisticsId + ", logisticsCompany='" + logisticsCompany + '\''
               + ", logisticsNo='" + logisticsNo + '\'' + ", deliveryTime=" + deliveryTime
               + ", isPackage=" + isPackage + ", createTime=" + createTime + ", createPerson='"
               + createPerson + '\'' + ", updateTime=" + updateTime + ", updatePerson='"
               + updatePerson + '\'' + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (OrderPackageDo) super.clone();
    }
}
