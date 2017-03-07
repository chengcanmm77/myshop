package com.bucket.shop.model.stock;

import com.bucket.shop.model.BaseDo;

/**
 * 供应商
 * 
 * @author wangchengxian
 *
 */
public class SupplierDo extends BaseDo {

    /**
     * 
     */
    private static final long serialVersionUID = 1157828970888895794L;

    /**
     * 供应商
     */
    private String            supplier;

    /**
     * 供应商编码
     */
    private String            supplierCode;

    /**
     * 税号
     */
    private String            taxNumber;

    /**
     * 地址
     */
    private String            address;

    /**
     * 地址对应的区域
     */
    private String            area;

    /**
     * 联系人
     */
    private String            linkman;

    /**
     * 电话号码
     */
    private String            telephone;

    /**
     * 1实体商品、2虚拟商品
     */
    private int               type;

    /**
     * 状态:1正常，2作废
     */
    private int               status;

    /**
     * 省市县
     */
    private String            areaDetail;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
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

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAreaDetail() {
        return areaDetail;
    }

    public void setAreaDetail(String areaDetail) {
        this.areaDetail = areaDetail;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

}
