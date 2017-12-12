package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

/**
 * 卡券商品对象
 * 
 * @author yuguantou
 * @version 1.0
 * @date 2017年12月12日
 */
public class CouponItemRo extends BaseRo implements Serializable {
	private static final long serialVersionUID = 3504985010165856446L;

	/** 批发展示平台 起购数量 临时使用 */
	private Integer buyerNum;

	/** 市场价 */
	private Double marketPrice;

	/** 网站价 */
	private Double salePrice;

	/** 有效库存 */
	private Integer avlStorage;

	/** 卡券名称，作为商品名称存 */
	private String couponName;

	/** 是否上架: 0-下架, 1-上架 */
	private Boolean isMarketable;

	public Integer getBuyerNum() {
		return buyerNum;
	}

	public void setBuyerNum(Integer buyerNum) {
		this.buyerNum = buyerNum;
	}

	public Double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getAvlStorage() {
		return avlStorage;
	}

	public void setAvlStorage(Integer avlStorage) {
		this.avlStorage = avlStorage;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Boolean getIsMarketable() {
		return isMarketable;
	}

	public void setIsMarketable(Boolean isMarketable) {
		this.isMarketable = isMarketable;
	}

}
