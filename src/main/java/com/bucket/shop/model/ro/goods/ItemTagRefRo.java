package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class ItemTagRefRo extends BaseRo implements Serializable {
	private static final long serialVersionUID = 8731841566396130122L;
	/**
	 * 商品标签关系ID
	 */
	private Integer itemTagId;
	/**
	 * 商品ID
	 */
	private Integer itemId;
	/**
	 * 标签ID
	 */
	private Integer tagId;

	public Integer getItemTagId() {
		return itemTagId;
	}

	public void setItemTagId(Integer itemTagId) {
		this.itemTagId = itemTagId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

}
