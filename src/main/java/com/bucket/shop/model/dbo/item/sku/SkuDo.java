package com.bucket.shop.model.dbo.item.sku;

public class SkuDo {
	/**
	 * SKU商品ID
	 */
	private Integer skuId;
	/**
	 * 类目ID
	 */
	private Integer categoryId;
	
	/**
	 * 类目名称
	 */
	private String categoryName;
    /**
     * SKU商品编码
     */
    private String categoryCode;
	/**
	 * 品牌ID
	 */
	private Integer brandId;
	
	/**
     * 品牌名称
     */
    private String brandName;
	/**
	 * SKU商品名称
	 */
	private String skuName;
	/**
	 * SKU商品编码
	 */
	private String skuCode;
	/**
	 * 厂商编码
	 */
	private String manufactoryCode;
	/**
	 * 状态 0删除 1启动 2禁用
	 */
	private Integer status;
	/**
	 * 是否基础SKU 0否 1 是
	 */
	private Integer isBaseSku;
	/**
	 * 单位-todo
	 */
	private String unit;
	/**
     * 成本价
     */
    private Integer costPrice;
	/**
	 * 过期时间
	 */
	private Integer expireDay;
	/**
	 * 重量
	 */
	private Double weight;
	/**
	 * 包装类型
	 */
	private String packingType;
	/**
	 * 生产日期形态:1-生产日期、2-周期、3-截止日期、4-无
	 */
	private String producingDateType;
	/**
	 * 产地
	 */
	private String producingRegion;
	/**
	 * 长度(毫米)
	 */
	private Integer length;
	/**
	 * 宽度(毫米)
	 */
	private Integer width;
	/**
	 * 高度(毫米)
	 */
	private Integer high;
	/**
	 * 体积
	 */
	private Float volume;
	/**
	 * 采购价格(分)
	 */
	private Integer purchasePrice;
	/**
	 * 生产状态
	 */
	private Integer productionStatus;
	
	/**
     * 关键属性1
     */
    private String keyValue1;
    
    /**
     * 关键属性2
     */
    private String keyValue2;
    
    /**
     * 特征标签
     */
    private String capabilityTags;

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getManufactoryCode() {
		return manufactoryCode;
	}

	public void setManufactoryCode(String manufactoryCode) {
		this.manufactoryCode = manufactoryCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsBaseSku() {
		return isBaseSku;
	}

	public void setIsBaseSku(Integer isBaseSku) {
		this.isBaseSku = isBaseSku;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Integer costPrice) {
		this.costPrice = costPrice;
	}

	public Integer getExpireDay() {
		return expireDay;
	}

	public void setExpireDay(Integer expireDay) {
		this.expireDay = expireDay;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getPackingType() {
		return packingType;
	}

	public void setPackingType(String packingType) {
		this.packingType = packingType;
	}

	public String getProducingDateType() {
		return producingDateType;
	}

	public void setProducingDateType(String producingDateType) {
		this.producingDateType = producingDateType;
	}

	public String getProducingRegion() {
		return producingRegion;
	}

	public void setProducingRegion(String producingRegion) {
		this.producingRegion = producingRegion;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHigh() {
		return high;
	}

	public void setHigh(Integer high) {
		this.high = high;
	}

	public Float getVolume() {
		return volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}

	public Integer getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getProductionStatus() {
		return productionStatus;
	}

	public void setProductionStatus(Integer productionStatus) {
		this.productionStatus = productionStatus;
	}

	public String getKeyValue1() {
		return keyValue1;
	}

	public void setKeyValue1(String keyValue1) {
		this.keyValue1 = keyValue1;
	}

	public String getKeyValue2() {
		return keyValue2;
	}

	public void setKeyValue2(String keyValue2) {
		this.keyValue2 = keyValue2;
	}

	public String getCapabilityTags() {
		return capabilityTags;
	}

	public void setCapabilityTags(String capabilityTags) {
		this.capabilityTags = capabilityTags;
	}
    
    
}
