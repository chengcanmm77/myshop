package com.bucket.shop.model.ro.goods;

import java.io.Serializable;
import java.util.List;

import com.bucket.shop.model.ro.BaseRo;

public class TagRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = 8111188805737337494L;

	/**
     * 标签ID
     */
    private Integer           tagId;
    
    /**
     * 标签所属店铺 1 C端 2 B端
     */
    private Integer           shopId;
    /**
     * 标签类型 1 服务标签  2 活动标签 3 动态标签 4 适配标签 5 特性标签
     */
    private Integer           tagType;
    /**
     * 标签名称
     */
    private String            tagName;
    /**
     * 显示位置：1.正标，2.角标
     */
    private Integer           tagDisplay;
    /**
     * 角标显示位置：1.列表显示，2.商品主图显示
     */
    private Integer           tagCornerDisplay;
    /**
     * web图片是否使用背景色：1.使用，2.不使用
     */
    private Integer           tagUseBackcolor;
    /**
     * web标签图标
     */
    private String            tagWebIcon;
    /**
     * app标签图标
     */
    private String            tagAppIcon;
    /**
     * 备注
     */
    private String            tagDesc;

    /**
     * 标签排序
     */
    private Integer           tagOrder;
    /**
     * 标签状态
     */
    private Integer           tagStatus;

    /**
     * 是否是系统标签
     */
    private Integer           tagIsSystem;
    /**
     * 背景颜色
     */
    private String tagBackColor;
    
    List<TagRo> serveTags;
    
    List<TagRo> activityTags;

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getTagType() {
		return tagType;
	}

	public void setTagType(Integer tagType) {
		this.tagType = tagType;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Integer getTagDisplay() {
		return tagDisplay;
	}

	public void setTagDisplay(Integer tagDisplay) {
		this.tagDisplay = tagDisplay;
	}

	public Integer getTagCornerDisplay() {
		return tagCornerDisplay;
	}

	public void setTagCornerDisplay(Integer tagCornerDisplay) {
		this.tagCornerDisplay = tagCornerDisplay;
	}

	public Integer getTagUseBackcolor() {
		return tagUseBackcolor;
	}

	public void setTagUseBackcolor(Integer tagUseBackcolor) {
		this.tagUseBackcolor = tagUseBackcolor;
	}

	public String getTagWebIcon() {
		return tagWebIcon;
	}

	public void setTagWebIcon(String tagWebIcon) {
		this.tagWebIcon = tagWebIcon;
	}

	public String getTagAppIcon() {
		return tagAppIcon;
	}

	public void setTagAppIcon(String tagAppIcon) {
		this.tagAppIcon = tagAppIcon;
	}

	public String getTagDesc() {
		return tagDesc;
	}

	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
	}

	public Integer getTagOrder() {
		return tagOrder;
	}

	public void setTagOrder(Integer tagOrder) {
		this.tagOrder = tagOrder;
	}

	public Integer getTagStatus() {
		return tagStatus;
	}

	public void setTagStatus(Integer tagStatus) {
		this.tagStatus = tagStatus;
	}

	public Integer getTagIsSystem() {
		return tagIsSystem;
	}

	public void setTagIsSystem(Integer tagIsSystem) {
		this.tagIsSystem = tagIsSystem;
	}

	public String getTagBackColor() {
		return tagBackColor;
	}

	public void setTagBackColor(String tagBackColor) {
		this.tagBackColor = tagBackColor;
	}

	public List<TagRo> getServeTags() {
		return serveTags;
	}

	public void setServeTags(List<TagRo> serveTags) {
		this.serveTags = serveTags;
	}

	public List<TagRo> getActivityTags() {
		return activityTags;
	}

	public void setActivityTags(List<TagRo> activityTags) {
		this.activityTags = activityTags;
	}
    
    
}
