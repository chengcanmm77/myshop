package com.bucket.shop.model.stock;

import com.bucket.shop.model.BaseDo;

/**
 * 期初库存
 *
 */
public class OpeningInventoryDo extends BaseDo {

    private String skuCode;     // sku 编码
    private String barCode;     // 条码
    private String productName; // 商品名称
    private String brand;       // 商品品牌
    private String spec;        // 规格型号
    private String warehouse;   //  仓库名称
    private long   warehouseId; // 仓库ID
    private String unit;        // 单位
    private int    inventory;   // 期初库存
    private float  evaluate;    // 暂估计价
    private int    accountDay;  // 账期;例如：201509

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public float getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(float evaluate) {
        this.evaluate = evaluate;
    }

    public int getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(int accountDay) {
        this.accountDay = accountDay;
    }

}
