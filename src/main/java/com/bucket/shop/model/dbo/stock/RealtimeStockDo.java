package com.bucket.shop.model.dbo.stock;

import com.bucket.shop.model.dbo.BaseDo;

/**
 *
 * 实时库存对象，按分来设置实时库存；相对与RealtimeInventorDo的主要差异在统计粒度；
 * RealtimeInventorDo是以天为单位统计的
 *
 */
public class RealtimeStockDo extends BaseDo {

    private static final long serialVersionUID = -2095498517214957531L;
    /**
     * sku编码
     */
    private String            skuCode;
    /**
     * sku名称
     */
    private String            skuName;
    /**
     * 仓库id
     */
    private long              wareHouseId;
    /**
     * 仓库名称
     */
    private String            wareHouseName;
    /**
     * OMS库存数量
     */
    private long              omsStockQty;
    /**
     * WMS库存数量
     */
    private long              wmsStockQty;
    /**
     * 库存异常时是否发邮件；false：不发；true：发
     */
    private boolean           isStockExceptionMail;
    /**
     * 库存预警值；当omsStockQty < warningValue时，发出预警
     */
    private long              warningValue;
    /**
     * 库存数触发预警时，是否发送邮件；false：不发；true：发送
     */
    private boolean           isWarningMail;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public long getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(long wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }

    public long getOmsStockQty() {
        return omsStockQty;
    }

    public void setOmsStockQty(long omsStockQty) {
        this.omsStockQty = omsStockQty;
    }

    public long getWmsStockQty() {
        return wmsStockQty;
    }

    public void setWmsStockQty(long wmsStockQty) {
        this.wmsStockQty = wmsStockQty;
    }

    public boolean isStockExceptionMail() {
        return isStockExceptionMail;
    }

    public void setStockExceptionMail(boolean stockExceptionMail) {
        isStockExceptionMail = stockExceptionMail;
    }

    public long getWarningValue() {
        return warningValue;
    }

    public void setWarningValue(long warningValue) {
        this.warningValue = warningValue;
    }

    public boolean isWarningMail() {
        return isWarningMail;
    }

    public void setWarningMail(boolean warningMail) {
        isWarningMail = warningMail;
    }

}
