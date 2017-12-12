package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class ItemSeoRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = -2704314760725164081L;

	/**主键id*/
    private Integer           itemSeoId;

    /**商品id*/
    private Integer           itemId;

    /**搜索关键字*/
    private String            searchKeyword;

    /**商品SEO内容标题*/
    private String            seoTitle;

    /** 商品SEO内容关键字*/
    private String            seoKeywords;

    /** 商品SEO内容描述*/
    private String            seoDescription;

	public Integer getItemSeoId() {
		return itemSeoId;
	}

	public void setItemSeoId(Integer itemSeoId) {
		this.itemSeoId = itemSeoId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getSeoKeywords() {
		return seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}
    
}
