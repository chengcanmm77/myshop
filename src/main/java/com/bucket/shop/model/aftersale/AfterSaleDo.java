package com.bucket.shop.model.aftersale;

import java.util.Date;

import com.bucket.shop.model.BaseDo;

public class AfterSaleDo extends BaseDo {

    private static final long serialVersionUID = -6466322787546168637L;
    private Long              id;
    /** 售后编号 */
    private String            no;
    /** 三方售后编号 */
    private String            thirdNo;
    /** 所属订单号 */
    private Long              orderId;
    /** 状态码 */
    private Integer           status;
    /** 发货状态码 */
    private Integer           sendStatus;
    /** 退款支付单号 */
    private String            refundNo;
    /** 退款标记 1-待退款 2-已退款 3-无需退款 */
    private Integer           refundFlag;
    /** 申请原因id */
    private Integer           reason;
    /** 售后发起类型 1-用户申请 2-客服申请 */
    private Integer           type;
    /** 退款金额 */
    private Double            refundSum;
    /** 运费金额 */
    private Double            freightSum;
    /** 优惠券是否可退标记 */
    private Integer           couponFlag       = 0;
    /** 售后申请时间*/
    private Date              applyTime;
    /** 创建时间 */
    private Date              returnTime;
    /** 申请备注 */
    private String            askNote;
    /** 申请图片 */
    private String            askImgs;
    /** 客服备注 */
    private String            kfNote;
    /** 审核备注 */
    private String            auditNote;
    /** 操作人（姓名） */
    private String            operator;
    // 商品订单Id
    private String            goodsOrderIds;
    // 服务订单Id
    private String            serverOrderIds;

    /** 售后类型 0-退款 1-换货 2-退货 3-补偿退款*/
    private Integer           refundType;
    /** 错发错派物流公司名称 */
    private String            relateLogisticsCompany;
    /** 错发错派物流公司编码 */
    private String            relateLogisticsNo;
    /** 错发等相关物流公司id */
    private String            relateLogisticsId;
    /** 错发错派仓库id*/
    private String            relateWarehouseId;
    /**错发错派仓库名称*/
    private String            relateWarehouseName;
    /** 错发关联的售后单号 */
    private String            relateAftersaleNo;

    /**退货物流公司名称*/
    private String            logisticsCompany;
    /**退货物流公司编码*/
    private String            logisticsCode;
    /**退货物流单号*/
    private String            logisticsNo;
    /**退货寄件人电话*/
    private String            senderPhone;
    /** 退货仓库id */
    private String            returnWarehouseId;
    /** 退货仓库名称 */
    private String            returnWarehouseName;
    /** 退货的省编号*/
    private String            returnProvince;
    /** 退货的市编号*/
    private String            returnCity;
    /** 退货的区编号*/
    private String            returnCounty;
    /** 退货地址省份名称 */
    private String            returnProvinceName;
    /** 退货地址市名称 */
    private String            returnCityName;
    /** 退货地址区名称 */
    private String            returnCountyName;
    /** 退货地址 */
    private String            returnAddress;
    /** 退货收货联系人姓名 */
    private String            returnContacts;
    /** 退货收货人联系人电话 */
    private String            returnPhone;
    /**是否已退货寄回*/
    private Integer           returnBackFlag;
    /**换货收货人地址**/
    private String            consigneeAddress;
    /**换货收货人姓名**/
    private String            consigneeContacts;
    /**换货收货人电话**/
    private String            consigneePhone;
    /** 发货物流公司 */
    private String            swapLogisticsCompany;
    /**收货的省编号*/
    private String            consigneeProvince;
    /**收货的市编号*/
    private String            consigneeCity;
    /**收货的区编号*/
    private String            consigneeCounty;
    /** 发货地址省份名称 */
    private String            consigneeProvinceName;
    /** 发货地址市名称 */
    private String            consigneeCityName;
    /** 发货地址区名称 */
    private String            consigneeCountyName;
    /**发货仓库ID**/
    private Integer           warehouseId      = 0;
    /**发货仓库名称**/
    private String            warehouseName;
    /**发货物流公司ID**/
    private Integer           logisId          = 0;
    /**发货物流单号*/
    private String            consigneeLogisNo;
    /**备注*/
    private String            remark;
    /**售后来源*/
    private Integer           source;
    /**发起退款方式*/
    private Integer           refundWay;
    /**退款建议价*/
    private Double            suggestSum;
    /**第三方售后状态*/
    private Integer           thirdStatus;
    /**异常标记*/
    private boolean           abnormalFlag;
    /**三方已确认标记*/
    private Integer           confirmFlag;
    /**客服选择的退款类型，给oms统计用*/
    private Integer           omsReason;
    /**用户ID*/
    private Long              userId;
    /**订单编号*/
    private String            orderNo;
    private String            wrongOrderNo;
    /**供应商编码*/
    private String            supplierCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getThirdNo() {
        return thirdNo;
    }

    public void setThirdNo(String thirdNo) {
        this.thirdNo = thirdNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public Integer getRefundFlag() {
        return refundFlag;
    }

    public void setRefundFlag(Integer refundFlag) {
        this.refundFlag = refundFlag;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getRefundSum() {
        return refundSum;
    }

    public void setRefundSum(Double refundSum) {
        this.refundSum = refundSum;
    }

    public Double getFreightSum() {
        return freightSum;
    }

    public void setFreightSum(Double freightSum) {
        this.freightSum = freightSum;
    }

    public Integer getCouponFlag() {
        return couponFlag;
    }

    public void setCouponFlag(Integer couponFlag) {
        this.couponFlag = couponFlag;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getAskNote() {
        return askNote;
    }

    public void setAskNote(String askNote) {
        this.askNote = askNote;
    }

    public String getAskImgs() {
        return askImgs;
    }

    public void setAskImgs(String askImgs) {
        this.askImgs = askImgs;
    }

    public String getKfNote() {
        return kfNote;
    }

    public void setKfNote(String kfNote) {
        this.kfNote = kfNote;
    }

    public String getAuditNote() {
        return auditNote;
    }

    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getGoodsOrderIds() {
        return goodsOrderIds;
    }

    public void setGoodsOrderIds(String goodsOrderIds) {
        this.goodsOrderIds = goodsOrderIds;
    }

    public String getServerOrderIds() {
        return serverOrderIds;
    }

    public void setServerOrderIds(String serverOrderIds) {
        this.serverOrderIds = serverOrderIds;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public String getRelateLogisticsCompany() {
        return relateLogisticsCompany;
    }

    public void setRelateLogisticsCompany(String relateLogisticsCompany) {
        this.relateLogisticsCompany = relateLogisticsCompany;
    }

    public String getRelateLogisticsNo() {
        return relateLogisticsNo;
    }

    public void setRelateLogisticsNo(String relateLogisticsNo) {
        this.relateLogisticsNo = relateLogisticsNo;
    }

    public String getRelateLogisticsId() {
        return relateLogisticsId;
    }

    public void setRelateLogisticsId(String relateLogisticsId) {
        this.relateLogisticsId = relateLogisticsId;
    }

    public String getRelateWarehouseId() {
        return relateWarehouseId;
    }

    public void setRelateWarehouseId(String relateWarehouseId) {
        this.relateWarehouseId = relateWarehouseId;
    }

    public String getRelateWarehouseName() {
        return relateWarehouseName;
    }

    public void setRelateWarehouseName(String relateWarehouseName) {
        this.relateWarehouseName = relateWarehouseName;
    }

    public String getRelateAftersaleNo() {
        return relateAftersaleNo;
    }

    public void setRelateAftersaleNo(String relateAftersaleNo) {
        this.relateAftersaleNo = relateAftersaleNo;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getReturnWarehouseId() {
        return returnWarehouseId;
    }

    public void setReturnWarehouseId(String returnWarehouseId) {
        this.returnWarehouseId = returnWarehouseId;
    }

    public String getReturnWarehouseName() {
        return returnWarehouseName;
    }

    public void setReturnWarehouseName(String returnWarehouseName) {
        this.returnWarehouseName = returnWarehouseName;
    }

    public String getReturnProvince() {
        return returnProvince;
    }

    public void setReturnProvince(String returnProvince) {
        this.returnProvince = returnProvince;
    }

    public String getReturnCity() {
        return returnCity;
    }

    public void setReturnCity(String returnCity) {
        this.returnCity = returnCity;
    }

    public String getReturnCounty() {
        return returnCounty;
    }

    public void setReturnCounty(String returnCounty) {
        this.returnCounty = returnCounty;
    }

    public String getReturnProvinceName() {
        return returnProvinceName;
    }

    public void setReturnProvinceName(String returnProvinceName) {
        this.returnProvinceName = returnProvinceName;
    }

    public String getReturnCityName() {
        return returnCityName;
    }

    public void setReturnCityName(String returnCityName) {
        this.returnCityName = returnCityName;
    }

    public String getReturnCountyName() {
        return returnCountyName;
    }

    public void setReturnCountyName(String returnCountyName) {
        this.returnCountyName = returnCountyName;
    }

    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress;
    }

    public String getReturnContacts() {
        return returnContacts;
    }

    public void setReturnContacts(String returnContacts) {
        this.returnContacts = returnContacts;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public Integer getReturnBackFlag() {
        return returnBackFlag;
    }

    public void setReturnBackFlag(Integer returnBackFlag) {
        this.returnBackFlag = returnBackFlag;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeContacts() {
        return consigneeContacts;
    }

    public void setConsigneeContacts(String consigneeContacts) {
        this.consigneeContacts = consigneeContacts;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getSwapLogisticsCompany() {
        return swapLogisticsCompany;
    }

    public void setSwapLogisticsCompany(String swapLogisticsCompany) {
        this.swapLogisticsCompany = swapLogisticsCompany;
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeCounty() {
        return consigneeCounty;
    }

    public void setConsigneeCounty(String consigneeCounty) {
        this.consigneeCounty = consigneeCounty;
    }

    public String getConsigneeProvinceName() {
        return consigneeProvinceName;
    }

    public void setConsigneeProvinceName(String consigneeProvinceName) {
        this.consigneeProvinceName = consigneeProvinceName;
    }

    public String getConsigneeCityName() {
        return consigneeCityName;
    }

    public void setConsigneeCityName(String consigneeCityName) {
        this.consigneeCityName = consigneeCityName;
    }

    public String getConsigneeCountyName() {
        return consigneeCountyName;
    }

    public void setConsigneeCountyName(String consigneeCountyName) {
        this.consigneeCountyName = consigneeCountyName;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Integer getLogisId() {
        return logisId;
    }

    public void setLogisId(Integer logisId) {
        this.logisId = logisId;
    }

    public String getConsigneeLogisNo() {
        return consigneeLogisNo;
    }

    public void setConsigneeLogisNo(String consigneeLogisNo) {
        this.consigneeLogisNo = consigneeLogisNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getRefundWay() {
        return refundWay;
    }

    public void setRefundWay(Integer refundWay) {
        this.refundWay = refundWay;
    }

    public Double getSuggestSum() {
        return suggestSum;
    }

    public void setSuggestSum(Double suggestSum) {
        this.suggestSum = suggestSum;
    }

    public Integer getThirdStatus() {
        return thirdStatus;
    }

    public void setThirdStatus(Integer thirdStatus) {
        this.thirdStatus = thirdStatus;
    }

    public boolean isAbnormalFlag() {
        return abnormalFlag;
    }

    public void setAbnormalFlag(boolean abnormalFlag) {
        this.abnormalFlag = abnormalFlag;
    }

    public Integer getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(Integer confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public Integer getOmsReason() {
        return omsReason;
    }

    public void setOmsReason(Integer omsReason) {
        this.omsReason = omsReason;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getWrongOrderNo() {
        return wrongOrderNo;
    }

    public void setWrongOrderNo(String wrongOrderNo) {
        this.wrongOrderNo = wrongOrderNo;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
