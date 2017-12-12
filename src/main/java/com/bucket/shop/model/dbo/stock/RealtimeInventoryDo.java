package com.bucket.shop.model.dbo.stock;

import java.util.Date;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 准实时库存
 *
 */
public class RealtimeInventoryDo extends BaseDo {

    /**
     * 
     */
    private static final long serialVersionUID = 2639835036152274711L;

    private String            skuCode;                                // sku编码
    private String            barCode;                                // 条码
    private String            productName;                            // 商品名称
    private String            spec;                                   // 规格
    private String            productBrand;                           // 商品品牌
    private String            warehouse;                              // 仓库
    private long              warehouseId;                            // 仓库ID
    private int               inventory;                              //实时库存
    private int               availableNum;                           //可用库存
    private int               transitNum;                             //在途库存
    private double            suggestPrice;                           //库存建议价
    private String            unit;                                   // 单位
    private Date              recordDate;                             // 最后记录日期

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

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
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

    public void setWarehouseId(long wardhouseId) {
        this.warehouseId = wardhouseId;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * @return the suggestPrice
     */
    public double getSuggestPrice() {
        return suggestPrice;
    }

    /**
     * @param suggestPrice the suggestPrice to set
     */
    public void setSuggestPrice(double suggestPrice) {
        this.suggestPrice = suggestPrice;
    }

    public int getAvailableNum() {
        return availableNum;
    }

    public void setAvailableNum(int availableNum) {
        this.availableNum = availableNum;
    }

    public int getTransitNum() {
        return transitNum;
    }

    public void setTransitNum(int transitNum) {
        this.transitNum = transitNum;
    }

}
