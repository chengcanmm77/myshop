package com.bucket.shop.model.dbo.stock;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 库存变动明细
 *
 */
@Alias("inventoryDetailDo")
public class InventoryDetailDo extends BaseDo {

    /**
     * 入库
     */
    public static final int TYPE_IN  = 1;

    /**
     * 出度
     */
    public static final int TYPE_OUT = 2;

    private String          skuCode;       // 商品编码
    private String          orderNo;       //单据编号
    private String          sourceNo;      //来源单号
    private long            auditStatus;   //审核状态
    private Date            createTime;    //单据日期
    private String          unit;          //计量单位
    private String          barCode;       // 条码
    private String          productName;   // 商品名称
    private String          spec;          // 规格
    private String          warehouse;     // 仓库
    private long            warehouseId;   // 仓库ID
    private int             type;          // 出入库类型：1.采购入库，2.销售出库，3.销售退货入库，4.销售换货入库，5.销售换货出库，6.采购退货入库
    private int             amount;        // 数量
    private int             balanceNum;    // 结存数量
    private Date            operateDate;   // 操作日期
    private String          operator;      // 操作人
    private Date            billAuditTime; //单据日期

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBalanceNum() {
        return balanceNum;
    }

    public void setBalanceNum(int balanceNum) {
        this.balanceNum = balanceNum;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(long auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Date getBillAuditTime() {
        return billAuditTime;
    }

    public void setBillAuditTime(Date billAuditTime) {
        this.billAuditTime = billAuditTime;
    }

}
