package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class SkuImageRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = 1053742776922232632L;
	/**
	 * SKU图片ID
	 */
	private Integer skuImageId;
	/**
	 * SKU商品ID
	 */
	private Integer skuId;
	/**
	 * 图片类型 1 sku商品图片 2 包装图片
	 */
	private Integer type;
	/**
	 * SKU图片URL
	 */
	private String imageUrl;
	/**
	 * SKU图片标题
	 */
	private String title;
	/**
	 * SKU图片排序
	 */
	private Integer imgOrder;
	/**
	 * 原图
	 */
	private String original;
	/**
	 * 大图
	 */
	private String large;
	/**
	 * 中图
	 */
	private String medium;
	/**
	 * 小图
	 */
	private String thumbnail;
	public Integer getSkuImageId() {
		return skuImageId;
	}
	public void setSkuImageId(Integer skuImageId) {
		this.skuImageId = skuImageId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getImgOrder() {
		return imgOrder;
	}
	public void setImgOrder(Integer imgOrder) {
		this.imgOrder = imgOrder;
	}
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	
}
