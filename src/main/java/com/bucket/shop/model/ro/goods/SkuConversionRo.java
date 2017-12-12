package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class SkuConversionRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = 2096395797766272994L;
	/**
	 * 主键
	 */
	private Integer skuConversionId;
	/**
	 * 基础SKU
	 */
	private Integer baseSkuId;
	/**
	 * 换算SKU
	 */
	private Integer skuId;
	/**
	 * 换算数量
	 */
	private Integer converNum;
	/**
	 * 基准sku编码
	 */
	private String baseSkuCode;
	public Integer getSkuConversionId() {
		return skuConversionId;
	}
	public void setSkuConversionId(Integer skuConversionId) {
		this.skuConversionId = skuConversionId;
	}
	public Integer getBaseSkuId() {
		return baseSkuId;
	}
	public void setBaseSkuId(Integer baseSkuId) {
		this.baseSkuId = baseSkuId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public Integer getConverNum() {
		return converNum;
	}
	public void setConverNum(Integer converNum) {
		this.converNum = converNum;
	}
	public String getBaseSkuCode() {
		return baseSkuCode;
	}
	public void setBaseSkuCode(String baseSkuCode) {
		this.baseSkuCode = baseSkuCode;
	}
	
}
