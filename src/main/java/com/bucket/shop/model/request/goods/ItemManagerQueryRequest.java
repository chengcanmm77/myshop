package com.bucket.shop.model.request.goods;

import com.bucket.shop.model.request.BasePageRequest;

public class ItemManagerQueryRequest extends BasePageRequest{

private Boolean           isMarketable=true;   
    
    /** 商品名称 */
    private String            itemName;   
    
    /** 商品编码 */
    private String            itemSN;
    
    /** spu编码 */
    private String            spuNO;
    
    /** 类目ID */
    private Integer           categoryId;
    
    /** 品牌ID */
    private Integer           brandId;
    
    /** 最小售价(分) */
    private Double           minSalePrice;
    
    /** 最大售价(分) */
    private Double           maxSalePrice;
    
    /** 最小库存 */
    private Integer           minLimitNum;
    
    /** 最大库存 */
    private Integer           maxLimitNum;
    /**
     * 库存最大值
     */
    private Integer showStorageMax;
    
    /**
     * 库存最小值
     */
    private Integer showStorageMin;
    /**
	 * 商品状态：0-删除 1-启用 2-禁用
	 */
	private Integer status;
	/**
	 * 赠品状态 0 可售商品 1 赠品 2 即可赠品,又可售商品
	 */
	private Integer saleType;
	/**
	 * 门店ID
	 */
	private Integer shopId;
	/**
	 * 模板ID
	 */
	private Integer templateId;
    /**
     * 经营类型
     */
    private Integer bussType;
    /**
     * 经销商编码
     */
    private String distributorCode;
    /**
     * 库存类型
     */
    private Integer storageType;
    /**
     * 库存下限
     */
    private Integer lowerStorageCount;
    /**
     * 库存上限
     */
    private Integer upperStorageCount;
    /**
     * 30天销量上限
     */
    private Integer lowerStatistic30;
    /**
     * 30销量下限
     */
    private Integer upperStatistic30;
	public Boolean getIsMarketable() {
		return isMarketable;
	}
	public void setIsMarketable(Boolean isMarketable) {
		this.isMarketable = isMarketable;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemSN() {
		return itemSN;
	}
	public void setItemSN(String itemSN) {
		this.itemSN = itemSN;
	}
	public String getSpuNO() {
		return spuNO;
	}
	public void setSpuNO(String spuNO) {
		this.spuNO = spuNO;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Double getMinSalePrice() {
		return minSalePrice;
	}
	public void setMinSalePrice(Double minSalePrice) {
		this.minSalePrice = minSalePrice;
	}
	public Double getMaxSalePrice() {
		return maxSalePrice;
	}
	public void setMaxSalePrice(Double maxSalePrice) {
		this.maxSalePrice = maxSalePrice;
	}
	public Integer getMinLimitNum() {
		return minLimitNum;
	}
	public void setMinLimitNum(Integer minLimitNum) {
		this.minLimitNum = minLimitNum;
	}
	public Integer getMaxLimitNum() {
		return maxLimitNum;
	}
	public void setMaxLimitNum(Integer maxLimitNum) {
		this.maxLimitNum = maxLimitNum;
	}
	public Integer getShowStorageMax() {
		return showStorageMax;
	}
	public void setShowStorageMax(Integer showStorageMax) {
		this.showStorageMax = showStorageMax;
	}
	public Integer getShowStorageMin() {
		return showStorageMin;
	}
	public void setShowStorageMin(Integer showStorageMin) {
		this.showStorageMin = showStorageMin;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSaleType() {
		return saleType;
	}
	public void setSaleType(Integer saleType) {
		this.saleType = saleType;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public Integer getBussType() {
		return bussType;
	}
	public void setBussType(Integer bussType) {
		this.bussType = bussType;
	}
	public String getDistributorCode() {
		return distributorCode;
	}
	public void setDistributorCode(String distributorCode) {
		this.distributorCode = distributorCode;
	}
	public Integer getStorageType() {
		return storageType;
	}
	public void setStorageType(Integer storageType) {
		this.storageType = storageType;
	}
	public Integer getLowerStorageCount() {
		return lowerStorageCount;
	}
	public void setLowerStorageCount(Integer lowerStorageCount) {
		this.lowerStorageCount = lowerStorageCount;
	}
	public Integer getUpperStorageCount() {
		return upperStorageCount;
	}
	public void setUpperStorageCount(Integer upperStorageCount) {
		this.upperStorageCount = upperStorageCount;
	}
	public Integer getLowerStatistic30() {
		return lowerStatistic30;
	}
	public void setLowerStatistic30(Integer lowerStatistic30) {
		this.lowerStatistic30 = lowerStatistic30;
	}
	public Integer getUpperStatistic30() {
		return upperStatistic30;
	}
	public void setUpperStatistic30(Integer upperStatistic30) {
		this.upperStatistic30 = upperStatistic30;
	}
    
}
