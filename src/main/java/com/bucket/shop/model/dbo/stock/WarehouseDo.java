package com.bucket.shop.model.dbo.stock;

import com.bucket.shop.model.dbo.BaseDo;

public class WarehouseDo extends BaseDo {

    private String  warehouseCode; // 仓库编号
    private String  warehouseName; // 仓库名称
    private String  address;       //地址
    private String  area;          // 区域代码
    private String  linkMan;       // 联系人
    private String  linkTel;       //联系电话
    private int     type = 1;      // 类型：1协同仓,2主仓,3分仓，9虚拟仓
    private boolean minus;         // 是否允许负库存

    private int     province;
    private int     city;

    private String  provinceName;

    private String  cityName;

    private String  areaName;

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isMinus() {
        return minus;
    }

    public void setMinus(boolean minus) {
        this.minus = minus;
    }

    /**
     * @return the province
     */
    public int getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(int province) {
        this.province = province;
    }

    /**
     * @return the city
     */
    public int getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(int city) {
        this.city = city;
    }

    /**
     * @return the provinceName
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName the provinceName to set
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the areaName
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName the areaName to set
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

}
