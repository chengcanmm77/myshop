package com.bucket.shop.model.dbo.goods;

import java.util.Date;

/**
 * 商品
 * @author user
 *
 */
public class ItemDo {

	/**商品ID 主键      */
    private Integer itemId;

    /**品牌ID      */
    private Integer brandId;

    /**类目ID'*/
    private Integer categoryId;
    /**
     * 类目编码
     */
    private String categoryCode;
    /**门店ID*/
    private Integer shopId;
    /** 模板ID */
    private Integer templateId;

    /**商品名称*/
    private String  itemName;

    /**副标题*/
    private String  caption;
    
    /**商品编码*/
    private String  itemCode;

    /**市场价  用分表示*/
    private Integer marketPrice;

    /**网站价  用分表示*/
    private Integer salePrice;

    /**APP价  用分表示*/
    private Integer appPrice;

    /**是否上架   0-下架 1-上架 */
    private Boolean isMarketable;

    /**APP端是否售卖 0-不出售 1-出售 */
    private Boolean isAppSale;

    /**WEB端是否售卖 0-不出售 1-出售 */
    private Boolean isWebSale;

    /**商品描述 */
    private String  itemDesc;

    /**限购数量*/
    private Integer limitNum;

    /** 自设库存 */
    private Integer showStorage;
    
    /** 有效库存 */
    private Integer avlStorage;
    
    /** 同步库存 */
    private Integer syncStorage;
    
    /** 是否使用自设库存*/
    private Boolean useShowStorage = false;
    
    /** 是否关联同步库存*/
    private Boolean useSyncStorage = true;

    /**赠品状态 0-可售商品  1-赠品 2-即可赠品,又可售商品 */
    private Integer saleType;

    /**商品类型 1 单个SKU 2 多个SKU */
    private Integer itemType;
    
    /**商品状态 */
    private Integer status;
    /**发票类型：1-普通发票 2-无发票 */
    private Integer defReceipt;

    /**内容版本 */
    private Integer version;

    /**
     * 是否限购
     */
    private Integer isPurchase;
    /** 批发展示平台 限购开始时间   临时使用*/
    private Date    purchaseStartTime;

    /** 批发展示平台 限购结束时间  临时使用*/
    private Date    purchaseEndTime;

    /** 批发展示平台 限购是否重复,0:不重复 1：重复  临时使用*/
    private Integer purchaseIsRepeat;

    /** 批发展示平台 限购是否结束,0:未结束 1:已结束  临时使用*/
    private Integer purchaseIsFinished;
    /**
	 * 上架时间
	 */
	private Date onMarketableTime;
	/**
	 * 下架时间
	 */
	private Date offMarketableTime;
	/**
	 * 数据来源：0-自营，1-天猫，2-淘宝，3-京东 临时使用
	 */
	private Integer dataSource;
	/**
	 * 是否原配
	 */
	private Integer isOriginal;
	/** spu编码 */
    private String spuNO;
    /** 经营类型 */
    private Integer bussType;
    /**
     * 经销商编码
     */
    private String distributorCode;
    /**经销商名称*/
    private String distributorName;
    /** 销量统计 **/
    private Integer monthSales;
    
    //spu 主键
    private Integer spuId;
    //一级属性id
    private Integer firstAttributeId;
    
    //二级属性ID
    private Integer secondAttributeId;
    
    //物流模版ID
    private Integer logisticsId;
    
    //spu对应的主商品1.是 2.不是
    private Integer isMainItem;
    
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
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Integer getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Integer marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Integer getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}
	public Integer getAppPrice() {
		return appPrice;
	}
	public void setAppPrice(Integer appPrice) {
		this.appPrice = appPrice;
	}
	public Boolean getIsMarketable() {
		return isMarketable;
	}
	public void setIsMarketable(Boolean isMarketable) {
		this.isMarketable = isMarketable;
	}
	public Boolean getIsAppSale() {
		return isAppSale;
	}
	public void setIsAppSale(Boolean isAppSale) {
		this.isAppSale = isAppSale;
	}
	public Boolean getIsWebSale() {
		return isWebSale;
	}
	public void setIsWebSale(Boolean isWebSale) {
		this.isWebSale = isWebSale;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}
	public Integer getShowStorage() {
		return showStorage;
	}
	public void setShowStorage(Integer showStorage) {
		this.showStorage = showStorage;
	}
	public Integer getAvlStorage() {
		return avlStorage;
	}
	public void setAvlStorage(Integer avlStorage) {
		this.avlStorage = avlStorage;
	}
	public Integer getSyncStorage() {
		return syncStorage;
	}
	public void setSyncStorage(Integer syncStorage) {
		this.syncStorage = syncStorage;
	}
	public Boolean getUseShowStorage() {
		return useShowStorage;
	}
	public void setUseShowStorage(Boolean useShowStorage) {
		this.useShowStorage = useShowStorage;
	}
	public Boolean getUseSyncStorage() {
		return useSyncStorage;
	}
	public void setUseSyncStorage(Boolean useSyncStorage) {
		this.useSyncStorage = useSyncStorage;
	}
	public Integer getSaleType() {
		return saleType;
	}
	public void setSaleType(Integer saleType) {
		this.saleType = saleType;
	}
	public Integer getItemType() {
		return itemType;
	}
	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDefReceipt() {
		return defReceipt;
	}
	public void setDefReceipt(Integer defReceipt) {
		this.defReceipt = defReceipt;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getIsPurchase() {
		return isPurchase;
	}
	public void setIsPurchase(Integer isPurchase) {
		this.isPurchase = isPurchase;
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
	public Integer getPurchaseIsRepeat() {
		return purchaseIsRepeat;
	}
	public void setPurchaseIsRepeat(Integer purchaseIsRepeat) {
		this.purchaseIsRepeat = purchaseIsRepeat;
	}
	public Integer getPurchaseIsFinished() {
		return purchaseIsFinished;
	}
	public void setPurchaseIsFinished(Integer purchaseIsFinished) {
		this.purchaseIsFinished = purchaseIsFinished;
	}
	public Date getOnMarketableTime() {
		return onMarketableTime;
	}
	public void setOnMarketableTime(Date onMarketableTime) {
		this.onMarketableTime = onMarketableTime;
	}
	public Date getOffMarketableTime() {
		return offMarketableTime;
	}
	public void setOffMarketableTime(Date offMarketableTime) {
		this.offMarketableTime = offMarketableTime;
	}
	public Integer getDataSource() {
		return dataSource;
	}
	public void setDataSource(Integer dataSource) {
		this.dataSource = dataSource;
	}
	public Integer getIsOriginal() {
		return isOriginal;
	}
	public void setIsOriginal(Integer isOriginal) {
		this.isOriginal = isOriginal;
	}
	public String getSpuNO() {
		return spuNO;
	}
	public void setSpuNO(String spuNO) {
		this.spuNO = spuNO;
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
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public Integer getMonthSales() {
		return monthSales;
	}
	public void setMonthSales(Integer monthSales) {
		this.monthSales = monthSales;
	}
	public Integer getSpuId() {
		return spuId;
	}
	public void setSpuId(Integer spuId) {
		this.spuId = spuId;
	}
	public Integer getFirstAttributeId() {
		return firstAttributeId;
	}
	public void setFirstAttributeId(Integer firstAttributeId) {
		this.firstAttributeId = firstAttributeId;
	}
	public Integer getSecondAttributeId() {
		return secondAttributeId;
	}
	public void setSecondAttributeId(Integer secondAttributeId) {
		this.secondAttributeId = secondAttributeId;
	}
	public Integer getLogisticsId() {
		return logisticsId;
	}
	public void setLogisticsId(Integer logisticsId) {
		this.logisticsId = logisticsId;
	}
	public Integer getIsMainItem() {
		return isMainItem;
	}
	public void setIsMainItem(Integer isMainItem) {
		this.isMainItem = isMainItem;
	}
    
    
    
}
