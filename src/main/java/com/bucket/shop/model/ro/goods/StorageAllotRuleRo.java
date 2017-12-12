package com.bucket.shop.model.ro.goods;

/**
 * 商品库存分配规则
 * 
 * @author yuguantou
 * @version 1.0
 * @date 2017年12月12日
 */
public class StorageAllotRuleRo {

	/**skuId*/
    private Integer           skuId;

    /** 同步规则  */
    private Integer           mode;

    /** 平台信息   */
    private Integer           platform;

    /** 分配公式   */
    private String            formula;

    /** 分配结果  */
    private Integer           value;

    /** 是否余额优先*/
    private Boolean           balance;
    /**账面库存  */
    private Integer bookStorage;
    /**在途1天库存  */
    private Integer transStorage1d;
    /**在途2天库存  */
    private Integer transStorage2d;
    /**在途3天库存  */
    private Integer transStorage3d;
    /**店铺ID  */
    private String shopId;
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public Integer getPlatform() {
		return platform;
	}
	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Boolean getBalance() {
		return balance;
	}
	public void setBalance(Boolean balance) {
		this.balance = balance;
	}
	public Integer getBookStorage() {
		return bookStorage;
	}
	public void setBookStorage(Integer bookStorage) {
		this.bookStorage = bookStorage;
	}
	public Integer getTransStorage1d() {
		return transStorage1d;
	}
	public void setTransStorage1d(Integer transStorage1d) {
		this.transStorage1d = transStorage1d;
	}
	public Integer getTransStorage2d() {
		return transStorage2d;
	}
	public void setTransStorage2d(Integer transStorage2d) {
		this.transStorage2d = transStorage2d;
	}
	public Integer getTransStorage3d() {
		return transStorage3d;
	}
	public void setTransStorage3d(Integer transStorage3d) {
		this.transStorage3d = transStorage3d;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
    
}
