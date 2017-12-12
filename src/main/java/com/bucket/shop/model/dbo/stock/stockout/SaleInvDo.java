package com.bucket.shop.model.dbo.stock.stockout;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.dbo.BaseDo;

@Alias("saleInvDo")
public class SaleInvDo extends BaseDo {

    private static final long serialVersionUID = 5915863262885737270L;
    /**
     * 入库单号
     */
    private String            saleInvNo;
    /**
     * 源单ID
     */
    private long              salesId;
    /**
     * 源单号
     */
    private String            salesNo;
    /**
     * 源单类型
     */
    private int               sourceType;
    /**
     * 单据日期
     */
    private Date              billAuditTime;
    /**
     * 客户ID
     */
    private long              custId;
    /**
     * 客户名称
     */
    private String            custName;
    /**
     * 合计金额
     */
    private double            sumPrice;
    /**
     * 实付总运费
     */
    private double            sumDeliveryFee;
    /**
     * 仓库编码
     */
    private long              warehouseId;
    /**
     * 仓库名称
     */
    private String            warehouseName;
    /**
     * 运费承担方
     */
    private long              transSource;
    /**
     * 物流公司ID
     */
    private long              logisId;
    /**
     * 物流公司名称
     */
    private String            logisName;
    /**
     * 物流单号
     */
    private String            logisNo;
    /**
     * 单据 类型
     */
    private long              orderType;
    /**
     * 业务状态
     */
    private long              busStatus;
    /**
     * 审核状态
     */
    private long              auditStatus;
    /**
     * 单据状态
     */
    private long              billStatus;
    /**
     * 勾稽状态
     */
    private long              articulStatus;
    /**
     * 签收时间
     */
    private Date              signTime;
    /**
     * 签收状态
     */
    private long              sendStatus;
    /**
     * 备注
     */
    private String            remark;
    /**
     * 创建人
     */
    private String            creator;
    /**
     * 创建时间
     */
    private Date              createDate;
    /**
     * 修改人
     */
    private String            modifier;
    /**
     * 修改时间
     */
    private Date              modifyDate;
    /**
     * 收货人姓名
     */
    private String            receiverName;
    /**
     * 收货人地址
     */
    private String            receiverAddress;
    /**
     * 联系电话
     */
    private String            receiverMobile;
    /**
     * 收贷人省份
     */
    private String            receiverState;
    /**
     * 收贷人城市
     */
    private String            receiverCity;
    /**
     * 收贷人区/县
     */
    private String            receiverDistrict;

    public String getSaleInvNo() {
        return saleInvNo;
    }

    public void setSaleInvNo(String saleInvNo) {
        this.saleInvNo = saleInvNo;
    }

    public long getSalesId() {
        return salesId;
    }

    public void setSalesId(long salesId) {
        this.salesId = salesId;
    }

    public String getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(String salesNo) {
        this.salesNo = salesNo;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public Date getBillAuditTime() {
        return billAuditTime;
    }

    public void setBillAuditTime(Date billAuditTime) {
        this.billAuditTime = billAuditTime;
    }

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public double getSumDeliveryFee() {
        return sumDeliveryFee;
    }

    public void setSumDeliveryFee(double sumDeliveryFee) {
        this.sumDeliveryFee = sumDeliveryFee;
    }

    public long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public long getTransSource() {
        return transSource;
    }

    public void setTransSource(long transSource) {
        this.transSource = transSource;
    }

    public long getLogisId() {
        return logisId;
    }

    public void setLogisId(long logisId) {
        this.logisId = logisId;
    }

    public String getLogisName() {
        return logisName;
    }

    public void setLogisName(String logisName) {
        this.logisName = logisName;
    }

    public String getLogisNo() {
        return logisNo;
    }

    public void setLogisNo(String logisNo) {
        this.logisNo = logisNo;
    }

    public long getOrderType() {
        return orderType;
    }

    public void setOrderType(long orderType) {
        this.orderType = orderType;
    }

    public long getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(long busStatus) {
        this.busStatus = busStatus;
    }

    public long getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(long auditStatus) {
        this.auditStatus = auditStatus;
    }

    public long getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(long billStatus) {
        this.billStatus = billStatus;
    }

    public long getArticulStatus() {
        return articulStatus;
    }

    public void setArticulStatus(long articulStatus) {
        this.articulStatus = articulStatus;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public long getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(long sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

}