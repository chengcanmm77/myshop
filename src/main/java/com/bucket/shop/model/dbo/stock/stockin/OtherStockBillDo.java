package com.bucket.shop.model.dbo.stock.stockin;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 其它入库
 * @author bucket
 */
@Alias("otherStockBillDo")
public class OtherStockBillDo extends BaseDo {

    private static final long serialVersionUID = -3004594110133147354L;
    /**
     * 其他出入库单号
     */
    private String            otherInvNo;
    /**
     * WMS流水号
     */
    private String            sourceNo;
    /**
     * 源单ID
     */
    private long              prdId;
    /**
     * 源单号
     */
    private String            prdNo;
    /**
     * 单据日期
     */
    private Date              billAuditTime;
    /**
     * 源单类型
     */
    private int               sourceType;
    /**
     * 仓库code
     */
    private long              warehouseId;
    /**
     * 仓库名称
     */
    private String            warehouseName;
    /**
     * 客户ID
     */
    private long              custId;
    /**
     * 客户名称
     */
    private String            custName;
    /**
     * 采购业务员id
     */
    private long              buyerId;
    /**
     * 采购业务员名称
     */
    private String            buyerName;
    /**
     * 合计金额
     */
    private double            sumPrice;
    /**
     * 单据类型
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

    public String getOtherInvNo() {
        return otherInvNo;
    }

    public void setOtherInvNo(String otherInvNo) {
        this.otherInvNo = otherInvNo;
    }

    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo;
    }

    public long getPrdId() {
        return prdId;
    }

    public void setPrdId(long prdId) {
        this.prdId = prdId;
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo;
    }

    public Date getBillAuditTime() {
        return billAuditTime;
    }

    public void setBillAuditTime(Date billAuditTime) {
        this.billAuditTime = billAuditTime;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
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

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
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

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

}