package com.bucket.shop.model.ro.goods;

import java.io.Serializable;
import java.util.Date;

import com.bucket.shop.model.ro.BaseRo;

/**
 * 商品限购信息
 * 
 * @author yuguantou
 * @version 1.0
 * @date 2017年12月12日
 */
public class ItemPurchaseRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = -1148067397460743082L;
	/**商品ID*/
    private Integer           itemId;
    /**限购开始时间*/
    private Date              purchaseStartTime;
    /**限购结束时间*/
    private Date              purchaseEndTime;
    /**是否重复限购 0 不重复 1 重复*/
    private Boolean           purchaseIsRepeat;
    /**是否限购结束 0 未结束 1 已结束*/
    private Boolean           purchaseIsFinished;
    /**是否限购 0 未限购 1 限购*/
    private Boolean           isPurchase;
    /**限购数量*/
    private Integer           limitNum;
    /**起购数量*/
    private Integer           buyerNum;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Date getPurchaseStartTime() {
		return purchaseStartTime;
	}
	public void setPurchaseStartTime(Date purchaseStartTime) {
		this.purchaseStartTime = purchaseStartTime;
	}
	public Date getPurchaseEndTime() {
		return purchaseEndTime;
	}
	public void setPurchaseEndTime(Date purchaseEndTime) {
		this.purchaseEndTime = purchaseEndTime;
	}
	public Boolean getPurchaseIsRepeat() {
		return purchaseIsRepeat;
	}
	public void setPurchaseIsRepeat(Boolean purchaseIsRepeat) {
		this.purchaseIsRepeat = purchaseIsRepeat;
	}
	public Boolean getPurchaseIsFinished() {
		return purchaseIsFinished;
	}
	public void setPurchaseIsFinished(Boolean purchaseIsFinished) {
		this.purchaseIsFinished = purchaseIsFinished;
	}
	public Boolean getIsPurchase() {
		return isPurchase;
	}
	public void setIsPurchase(Boolean isPurchase) {
		this.isPurchase = isPurchase;
	}
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}
	public Integer getBuyerNum() {
		return buyerNum;
	}
	public void setBuyerNum(Integer buyerNum) {
		this.buyerNum = buyerNum;
	}
    
}
