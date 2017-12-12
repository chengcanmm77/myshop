package com.bucket.shop.model.dbo.stock;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 物流公司
 * 
 */
public class LogisticsCompanyDo extends BaseDo {

    private static final long serialVersionUID = -400224897329919230L;

    /**
     * 正常的
     */
    public static final int   STATUS_NORMAL    = 1;

    /**
     * 禁用的
     */
    public static final int   STATUS_FORBIDDEN = 2;

    private String            logisticsCorp;                          //物流公司
    private String            logisticsCode;                          //物流公司编号
    private String            taxNumber;                              //税号
    private String            address;                                // 地址
    private String            linkman;                                // 联系人
    private String            telephone;                              // 电话
    private String            bank;                                   // 银行
    private String            accounts;                               // 银行帐号
    private int               type;                                   // 物流类型:1快递，2物流
    private int               status;                                 // 状态：正常，禁用
    private Float             weightFirst;                            // 首重量
    private Float             weightFirstFee;                         // 重量首费
    private Float             weightContinue;                         // 续重
    private Float             weightContinueFee;                      // 续重费
    private Float             bulkFirst;                              // 体积
    private Float             bulkFirstFee;                           // 体积首费
    private Float             bulkContinue;                           //体积续
    private Float             bulkContinueFee;                        // 体积续费
    private boolean           isDefault;                              // 是否系统默认设置
    private Long              warehouseId;                            //所属仓库Id
    private String            jdId;                                   //对应京东物流公司编码
    private String            taobaoId;                               //对应淘宝物流公司编码
    private String            province;                               //省份
    private String            city;                                   // 城市
    private String            county;                                 //区/县
    private String            logisticsCodeTableId;                   //网点名称
    private String            logisticsCodeTableName;                 //网点编号
    private String            subAreacodes;                           //配送地域code

    public String getTaobaoId() {
        return taobaoId;
    }

    public void setTaobaoId(String taobaoId) {
        this.taobaoId = taobaoId;
    }

    public String getJdId() {
        return jdId;
    }

    public void setJdId(String jdId) {
        this.jdId = jdId;
    }

    public String getLogisticsCorp() {
        return logisticsCorp;
    }

    public void setLogisticsCorp(String logisticsCorp) {
        this.logisticsCorp = logisticsCorp;
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

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
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

    public Float getWeightFirst() {
        return weightFirst;
    }

    public void setWeightFirst(Float weightFirst) {
        this.weightFirst = weightFirst;
    }

    public Float getWeightFirstFee() {
        return weightFirstFee;
    }

    public void setWeightFirstFee(Float weightFirstFee) {
        this.weightFirstFee = weightFirstFee;
    }

    public Float getWeightContinue() {
        return weightContinue;
    }

    public void setWeightContinue(Float weightContinue) {
        this.weightContinue = weightContinue;
    }

    public Float getWeightContinueFee() {
        return weightContinueFee;
    }

    public void setWeightContinueFee(Float weightContinueFee) {
        this.weightContinueFee = weightContinueFee;
    }

    public Float getBulkFirst() {
        return bulkFirst;
    }

    public void setBulkFirst(Float bulkFirst) {
        this.bulkFirst = bulkFirst;
    }

    public Float getBulkFirstFee() {
        return bulkFirstFee;
    }

    public void setBulkFirstFee(Float bulkFirstFee) {
        this.bulkFirstFee = bulkFirstFee;
    }

    public Float getBulkContinue() {
        return bulkContinue;
    }

    public void setBulkContinue(Float bulkContinue) {
        this.bulkContinue = bulkContinue;
    }

    public Float getBulkContinueFee() {
        return bulkContinueFee;
    }

    public void setBulkContinueFee(Float bulkContinueFee) {
        this.bulkContinueFee = bulkContinueFee;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLogisticsCodeTableId() {
        return logisticsCodeTableId;
    }

    public void setLogisticsCodeTableId(String logisticsCodeTableId) {
        this.logisticsCodeTableId = logisticsCodeTableId;
    }

    public String getLogisticsCodeTableName() {
        return logisticsCodeTableName;
    }

    public void setLogisticsCodeTableName(String logisticsCodeTableName) {
        this.logisticsCodeTableName = logisticsCodeTableName;
    }

    public String getSubAreacodes() {
        return subAreacodes;
    }

    public void setSubAreacodes(String subAreacodes) {
        this.subAreacodes = subAreacodes;
    }

}
