package com.bucket.shop.model.dbo.stock.stockin;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 采购入库
 * @author bucket
 */
@Alias("stockBillDo")
public class StockBillDo extends BaseDo {

    private static final long serialVersionUID = 7385677938885614938L;
    /**
     * 入库单号
     */
    private String            stockNo;
    /**
     * WMS流水号
     */
    private String            sourceNo;
    /**
     * 源单ID
     */
    private long              puchsId;
    /**
     * 源单号
     */
    private String            puchsNo;
    /**
     * 单据日期
     */
    private Date              billAuditTime;
    /**
     * 源单类型
     */
    private int               sourceType;
    /**
     * 供应商ID
     */
    private long              supplierId;
    /**
     * 供应商编码
     */
    private String            supplierCode;
    /**
     * 供应商名称
     */
    private String            supplierName;
    /**
     * 仓库code
     */
    private long              warehouseId;
    /**
     * 仓库名称
     */
    private String            warehouseName;
    /**
     * 合计金额
     */
    private double            sumPrice;
    /**
     * 采购业务ID
     */
    private long              buyerId;
    /**
     * 采购业务名称
     */
    private String            buyerName;
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
     * 勾稽状态
     */
    private long              articulStatus;
    /**
     * 备注
     */
    private String            remark;
    /**
     * 是否已开过发票，0：未开，1：已开
     */
    private int               hasReceipt;
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

    public String getStockNo() {
        return stockNo;
    }

    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo;
    }

    public long getPuchsId() {
        return puchsId;
    }

    public void setPuchsId(long puchsId) {
        this.puchsId = puchsId;
    }

    public String getPuchsNo() {
        return puchsNo;
    }

    public void setPuchsNo(String puchsNo) {
        this.puchsNo = puchsNo;
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

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getHasReceipt() {
        return hasReceipt;
    }

    public void setHasReceipt(int hasReceipt) {
        this.hasReceipt = hasReceipt;
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

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

}