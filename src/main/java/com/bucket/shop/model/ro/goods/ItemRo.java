package com.bucket.shop.model.ro.goods;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.bucket.shop.model.ro.BaseRo;

public class ItemRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = 6796700756456049649L;

	/**
	 * 商品ID 主键
	 */
	private Long itemId;

	/**
	 * 品牌ID
	 */
	private Long brandId;

	/**
	 * 品牌名称
	 */
	private String brandName;

	/**
	 * 类目ID
	 */
	private Long categoryId;
	 /**
     * 类目编码
     */
    private String categoryCode;

	/**
	 * 类目名称
	 */
	private String categoryName;

	/** 门店ID */
	private Integer shopId;
	/**
	 * 模板ID
	 */
	private Integer templateId;
	
	/** 商品名称 */
	private String itemName;

	/** 副标题 */
	private String caption;

	/** 商品唯一码 */
	private String itemSN;

	/** 市场价 */
	private Double marketPrice;

	/** 网站价 */
	private Double salePrice;

	/** APP价 */
	private Double appPrice;

	/** 是否上架 0-下架 1-上架 */
	private Boolean isMarketable;

	/** APP端是否售卖 0-不出售 1-出售 */
	private Boolean isAppSale;

	/** WEB端是否售卖 0-不出售 1-出售 */
	private Boolean isWebSale;

	/** 商品描述 */
	private String itemDesc;

	/** 限购数量 */
	private Integer limitNum;

	/** 自设库存 */
	private Integer showStorage;
	
	 /** 有效库存 */
    private Integer avlStorage;
    
    /** 同步库存 */
    private Integer syncStorage;
	
	/** 是否使用自设库存*/
	private Boolean useShowStorage;
	
	/** 是否关联同步库存*/
    private Boolean useSyncStorage;
	
	/** 赠品状态 0-可售商品 1-赠品 2-即可赠品,又可售商品 */
	private Integer saleType;

	/** 商品类型 1 单个SKU 2 多个SKU */
	private Integer itemType;

	/** 商品状态 */
	private Integer status;

	/** 发票类型：1-普通发票 2-无发票 */
	private Integer defReceipt;

	/** 内容版本 */
	private Integer version;

	/** 主SkuID */
	private Integer mainSkuId;

	/** 批发展示平台 起购数量 临时使用 */
	private Integer buyerNum;
	
	/** 是否原配  */
    private Integer isOriginal;
    
    /** 是否原配  */
    private Integer isRecommendatory;

	/** 上架时间 */
	private Date onMarketableTime;
	
	/** 下架时间 */
	private Date offMarketableTime;

	/** 商品图片列表 */
	private List<ItemImageRo> images;

	/** 商品赠品列表 */
	private List<ItemGiftRo> gifts;

	/** 商品的SEO相关信息 */
	private ItemSeoRo seo;

	/** 商品SKU列表 */
	private List<SkuRo> skus;

	/** 商品标签列表 */
	private List<TagRo> tags;

	/** 商品属性列表 */
	private List<SkuAttrRo> attrs;

	/** 商品统计信息 */
	private ItemStatisticRo itemStatistic;
	
	/** 数据来源：0-自营，1-天猫，2-淘宝，3-京东 临时使用 */
    private Integer dataSource;
    
    /**是否是导入数据,true 是，false 否，默认： 否*/
    private Boolean isForImportData;
    /**同步库存*/
    private Integer synchronizedStorage;
    /**销量*/
    private Integer itemSales;
    /** 经营类型 参考<code>EnumBussType</code> */
    private Integer bussType;
    /**经销商编码*/
    private String distributorCode;
    /**经销商名称*/
    private String distributorName;
    /** 销量统计 **/
    private Integer monthSales;
    /**spu 主键*/
    private Integer spuId;
    /**一级属性id*/
    private Integer firstAttributeId;
    /**二级属性ID*/
    private Integer secondAttributeId;
    /**物流模版ID*/
    private Integer logisticsId;
   
    /** 
     * 批发展示平台 起购数量 临时使用
     */
    private Integer buyNum;
    
    /**商品限购相关信息，取代原有item中的限购信息*/
    public ItemPurchaseRo itemPurchaseRO;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public String getItemSN() {
		return itemSN;
	}

	public void setItemSN(String itemSN) {
		this.itemSN = itemSN;
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

	public Double getAppPrice() {
		return appPrice;
	}

	public void setAppPrice(Double appPrice) {
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

	public Integer getMainSkuId() {
		return mainSkuId;
	}

	public void setMainSkuId(Integer mainSkuId) {
		this.mainSkuId = mainSkuId;
	}

	public Integer getBuyerNum() {
		return buyerNum;
	}

	public void setBuyerNum(Integer buyerNum) {
		this.buyerNum = buyerNum;
	}

	public Integer getIsOriginal() {
		return isOriginal;
	}

	public void setIsOriginal(Integer isOriginal) {
		this.isOriginal = isOriginal;
	}

	public Integer getIsRecommendatory() {
		return isRecommendatory;
	}

	public void setIsRecommendatory(Integer isRecommendatory) {
		this.isRecommendatory = isRecommendatory;
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

	public List<ItemImageRo> getImages() {
		return images;
	}

	public void setImages(List<ItemImageRo> images) {
		this.images = images;
	}

	public List<ItemGiftRo> getGifts() {
		return gifts;
	}

	public void setGifts(List<ItemGiftRo> gifts) {
		this.gifts = gifts;
	}

	public ItemSeoRo getSeo() {
		return seo;
	}

	public void setSeo(ItemSeoRo seo) {
		this.seo = seo;
	}

	public List<SkuRo> getSkus() {
		return skus;
	}

	public void setSkus(List<SkuRo> skus) {
		this.skus = skus;
	}

	public List<TagRo> getTags() {
		return tags;
	}

	public void setTags(List<TagRo> tags) {
		this.tags = tags;
	}

	public List<SkuAttrRo> getAttrs() {
		return attrs;
	}

	public void setAttrs(List<SkuAttrRo> attrs) {
		this.attrs = attrs;
	}

	public ItemStatisticRo getItemStatistic() {
		return itemStatistic;
	}

	public void setItemStatistic(ItemStatisticRo itemStatistic) {
		this.itemStatistic = itemStatistic;
	}

	public Integer getDataSource() {
		return dataSource;
	}

	public void setDataSource(Integer dataSource) {
		this.dataSource = dataSource;
	}

	public Boolean getIsForImportData() {
		return isForImportData;
	}

	public void setIsForImportData(Boolean isForImportData) {
		this.isForImportData = isForImportData;
	}

	public Integer getSynchronizedStorage() {
		return synchronizedStorage;
	}

	public void setSynchronizedStorage(Integer synchronizedStorage) {
		this.synchronizedStorage = synchronizedStorage;
	}

	public Integer getItemSales() {
		return itemSales;
	}

	public void setItemSales(Integer itemSales) {
		this.itemSales = itemSales;
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

	public Integer getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public ItemPurchaseRo getItemPurchaseRO() {
		return itemPurchaseRO;
	}

	public void setItemPurchaseRO(ItemPurchaseRo itemPurchaseRO) {
		this.itemPurchaseRO = itemPurchaseRO;
	}
    
}
