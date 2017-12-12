package com.bucket.shop.model.request.goods;

import java.io.Serializable;
import java.util.List;

import com.bucket.shop.model.request.BasePageRequest;

public class SkuQueryRequest extends BasePageRequest implements Serializable{

	/**
	 * SKU商品ID
	 */
	private Integer skuId;
	/**
	 * SKUID列表
	 */
	private List<Integer> skuIds;
	/**
	 * 类目ID
	 */
	private Integer categoryId;
	/**
	 * 品牌ID
	 */
	private Integer brandId;
	/**
	 * SKU商品名称
	 */
	private String skuName;
	/**
	 * sku编码是否模糊查询
	 */
	private Boolean isSkuCodeLike=false;
	/**
	 * SKU商品编码
	 */
	private String skuCode;
    /**
     * SKU商品编码集合
     */
	private List<String> skuCodes;
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
	 * 包装类型
	 */
	private String packingType;
	/**
     * 生产状态 1.上产中；2.停产中
     */
    private Integer productionStatus;
    
    /**
     * 1代表:重量为空
     */
    private Integer isWeightNull;
    /**
     * 1代表:长宽高三个属性至少有一个为空
     */
    private Integer isLHWNull;
    /**
     * 1:商品和包装图片至少一个为空
     */
    private Integer isPicNull;
    /**
     * 重量最小值
     */
    private Double weightMin;
    /**
     * 重量最大值
     */
    private Double weightMax;
    /**
     * 长度最小值
     */
    private Integer lengthMin;
    /**
     * 长度最大值
     */
    private Integer lengthMax;
    /**
     * 宽度最小值
     */
    private Integer widthMin;
    /**
     * 宽度最大值
     */
    private Integer widthMax;
    /**
     * 高度最小值
     */
    private Integer highMin;
    /**
     * 高度最大值
     */
    private Integer highMax;
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public List<Integer> getSkuIds() {
		return skuIds;
	}
	public void setSkuIds(List<Integer> skuIds) {
		this.skuIds = skuIds;
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
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public Boolean getIsSkuCodeLike() {
		return isSkuCodeLike;
	}
	public void setIsSkuCodeLike(Boolean isSkuCodeLike) {
		this.isSkuCodeLike = isSkuCodeLike;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public List<String> getSkuCodes() {
		return skuCodes;
	}
	public void setSkuCodes(List<String> skuCodes) {
		this.skuCodes = skuCodes;
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
	public String getPackingType() {
		return packingType;
	}
	public void setPackingType(String packingType) {
		this.packingType = packingType;
	}
	public Integer getProductionStatus() {
		return productionStatus;
	}
	public void setProductionStatus(Integer productionStatus) {
		this.productionStatus = productionStatus;
	}
	public Integer getIsWeightNull() {
		return isWeightNull;
	}
	public void setIsWeightNull(Integer isWeightNull) {
		this.isWeightNull = isWeightNull;
	}
	public Integer getIsLHWNull() {
		return isLHWNull;
	}
	public void setIsLHWNull(Integer isLHWNull) {
		this.isLHWNull = isLHWNull;
	}
	public Integer getIsPicNull() {
		return isPicNull;
	}
	public void setIsPicNull(Integer isPicNull) {
		this.isPicNull = isPicNull;
	}
	public Double getWeightMin() {
		return weightMin;
	}
	public void setWeightMin(Double weightMin) {
		this.weightMin = weightMin;
	}
	public Double getWeightMax() {
		return weightMax;
	}
	public void setWeightMax(Double weightMax) {
		this.weightMax = weightMax;
	}
	public Integer getLengthMin() {
		return lengthMin;
	}
	public void setLengthMin(Integer lengthMin) {
		this.lengthMin = lengthMin;
	}
	public Integer getLengthMax() {
		return lengthMax;
	}
	public void setLengthMax(Integer lengthMax) {
		this.lengthMax = lengthMax;
	}
	public Integer getWidthMin() {
		return widthMin;
	}
	public void setWidthMin(Integer widthMin) {
		this.widthMin = widthMin;
	}
	public Integer getWidthMax() {
		return widthMax;
	}
	public void setWidthMax(Integer widthMax) {
		this.widthMax = widthMax;
	}
	public Integer getHighMin() {
		return highMin;
	}
	public void setHighMin(Integer highMin) {
		this.highMin = highMin;
	}
	public Integer getHighMax() {
		return highMax;
	}
	public void setHighMax(Integer highMax) {
		this.highMax = highMax;
	}
    
}
