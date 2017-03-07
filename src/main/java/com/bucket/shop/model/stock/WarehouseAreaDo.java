package com.bucket.shop.model.stock;

/**
 * 仓库_区域关联Do
 * 
 * @ClassName: WarehouseAreaDo
 * @author 鞠永成
 * @date 2015年10月30日 下午2:36:13
 */
public class WarehouseAreaDo {
    private long warehouseid;
    private long areaid;

    /**
     * @return the warehouseid
     */
    public long getWarehouseid() {
        return warehouseid;
    }

    /**
     * @param warehouseid
     *            the warehouseid to set
     */
    public void setWarehouseid(long warehouseid) {
        this.warehouseid = warehouseid;
    }

    /**
     * @return the areaid
     */
    public long getAreaid() {
        return areaid;
    }

    /**
     * @param areaid
     *            the areaid to set
     */
    public void setAreaid(long areaid) {
        this.areaid = areaid;
    }
}
