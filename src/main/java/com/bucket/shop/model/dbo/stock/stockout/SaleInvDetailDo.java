package com.bucket.shop.model.dbo.stock.stockout;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.dbo.BaseDo;

@Alias("saleInvDetailDo")
public class SaleInvDetailDo extends BaseDo {

    private static final long serialVersionUID = -6748944521121246882L;
    /**
     * 销售出入库单Id
     */
    private long              saleInvId;
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
     * 规格型号编码
     */
    private Integer           specModelCode;
    /**
     * 规格名称
     */
    private String            specName;
    /**
     * 单位
     */
    private String            unit;
    /**
     * 实际出入库数量
     */
    private int               storageNums;
    /**
     * 出入库单价
     */
    private double            storagePrice;
    /**
     * 验证时间
     */
    private Date              signTime;
    /**
     * 验证状态
     */
    private long              sendStatus;

    public long getSaleInvId() {
        return saleInvId;
    }

    public void setSaleInvId(long saleInvId) {
        this.saleInvId = saleInvId;
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

    public Integer getSpecModelCode() {
        return specModelCode;
    }

    public void setSpecModelCode(Integer specModelCode) {
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

}