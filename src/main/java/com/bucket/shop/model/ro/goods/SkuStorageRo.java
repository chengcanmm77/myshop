package com.bucket.shop.model.ro.goods;

import java.io.Serializable;
import java.util.List;

import com.bucket.shop.model.ro.BaseRo;

public class SkuStorageRo extends BaseRo implements Serializable {
	private static final long serialVersionUID = -124664207441396391L;
	/**Primary Key*/
    private Integer                  skuStorageId;
    /**SkuId*/
    private Integer                  skuId;
    /**区域id*/
    private Integer                  areaId;
    /**总库存 */
    private Integer                  total;
    /**是否允许全量同步 */
    private Boolean                  isFullSync;
    /**库存分配结果信息  */
    private List<StorageAllotRuleRo> allocationInfo;
    /**账面库存  */
    private Integer bookStorage;
    /**在途1天库存  */
    private Integer transStorage1d;
    /**在途2天库存  */
    private Integer transStorage2d;
    /**在途3天库存  */
    private Integer transStorage3d;
	public Integer getSkuStorageId() {
		return skuStorageId;
	}
	public void setSkuStorageId(Integer skuStorageId) {
		this.skuStorageId = skuStorageId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Boolean getIsFullSync() {
		return isFullSync;
	}
	public void setIsFullSync(Boolean isFullSync) {
		this.isFullSync = isFullSync;
	}
	public List<StorageAllotRuleRo> getAllocationInfo() {
		return allocationInfo;
	}
	public void setAllocationInfo(List<StorageAllotRuleRo> allocationInfo) {
		this.allocationInfo = allocationInfo;
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
    
}
