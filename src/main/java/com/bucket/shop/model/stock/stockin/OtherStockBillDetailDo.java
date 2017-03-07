package com.bucket.shop.model.stock.stockin;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.BaseDo;

/**
 * 其它入库明细
 */
@Alias("otherStockBillDetailDo")
public class OtherStockBillDetailDo extends BaseDo {

    private static final long serialVersionUID = 207854596986452825L;

    /**
     * 其他出入库单ID
     */
    private long              otherInvId;
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
     * 实际入库数量
     */
    private int               nums;
    /**
     * 入库单价
     */
    private double            tempPrice;
    /**
     * 小计
     */
    private double            paltry;
    /**
     * 采购数量
     */
    private int               purchNum;

    public long getOtherInvId() {
        return otherInvId;
    }

    public void setOtherInvId(long otherInvId) {
        this.otherInvId = otherInvId;
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

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public double getTempPrice() {
        return tempPrice;
    }

    public void setTempPrice(double tempPrice) {
        this.tempPrice = tempPrice;
    }

    public double getPaltry() {
        return paltry;
    }

    public void setPaltry(double paltry) {
        this.paltry = paltry;
    }

    public int getPurchNum() {
        return purchNum;
    }

    public void setPurchNum(int purchNum) {
        this.purchNum = purchNum;
    }

}