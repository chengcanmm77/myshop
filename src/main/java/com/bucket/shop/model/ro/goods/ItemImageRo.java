package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class ItemImageRo extends BaseRo implements Serializable{

	 /** 主键   */
    private Long id;

    /** 商品id */
    private Long itemId;

    /** 图片类型  1-主图 2-中图 3-大图   */
    private Integer type;

    /** 商品图片URL */
    @Deprecated
    private String  picUrl;

    /** 商品图片名称   */
    private String  title;

    /** 商品图片排序   */
    private Integer imgOrder;

    /** 原图   */
    private String  original;

    /** 大图   */
    private String  large;

    /** 中图  */
    private String  medium;

    /** 小图  */
    private String  thumbnail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
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
