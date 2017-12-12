package com.bucket.shop.model.dbo.stock.stockin;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 采购入口明细
 * 
 * @author bucket
 */
@Alias("stockBillDetailDo")
public class StockBillDetailDo extends BaseDo {

    private static final long serialVersionUID = -659985575232730326L;
    /**
     * 采购入库单号
     */
    private long              stockId;
    /**
     * 商品ID
     */
    private Integer           goodsId;
    /**
     * 商品编码
     */
    private String            goodsCode;
    /**
     * 商品名称
     */
    private String            goodsName;
    /**
     * 商品品牌
     */
    private String            goodsBrand;
    /**
     * 规格编码
     */
    private int               specModelCode;
    /**
     * 规格名称
     */
    private String            specName;
    /**
     * 单位
     */
    private String            unit;
    /**
     * 实际入库数量
     */
    private int               storageNums;
    /**
     * 入库单价
     */
    private double            storagePrice;

    public long getStockId() {
        return stockId;
    }

    public void setStockId(long stockId) {
        this.stockId = stockId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public int getSpecModelCode() {
        return specModelCode;
    }

    public void setSpecModelCode(int specModelCode) {
        this.specModelCode = specModelCode;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getStorageNums() {
        return storageNums;
    }

    public void setStorageNums(int storageNums) {
        this.storageNums = storageNums;
    }

    public double getStoragePrice() {
        return storagePrice;
    }

    public void setStoragePrice(double storagePrice) {
        this.storagePrice = storagePrice;
    }

}