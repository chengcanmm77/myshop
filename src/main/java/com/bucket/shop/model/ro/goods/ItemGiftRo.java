package com.bucket.shop.model.ro.goods;

import java.io.Serializable;
import java.util.List;

import com.bucket.shop.model.ro.BaseRo;

public class ItemGiftRo extends BaseRo implements Serializable{

	/**商品ID 主键      */
    private Integer           itemId;

    /**品牌ID      */
    private Integer           brandId;

    /**类目ID'*/
    private Integer           categoryId;

    /**商品名称*/
    private String            itemName;

    /**商品唯一码*/
    private String            itemNo;

    /**副标题*/
    private String            caption;

    /**商品编码*/
    private String            itemSN;
    
    /**赠品数量*/
    private Integer           num=1;

    private List<ItemImageRo> images;
    /**赠品数量*/
    private Integer         giftNum;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getItemSN() {
		return itemSN;
	}
	public void setItemSN(String itemSN) {
		this.itemSN = itemSN;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public List<ItemImageRo> getImages() {
		return images;
	}
	public void setImages(List<ItemImageRo> images) {
		this.images = images;
	}
	public Integer getGiftNum() {
		return giftNum;
	}
	public void setGiftNum(Integer giftNum) {
		this.giftNum = giftNum;
	}
    
    
}
