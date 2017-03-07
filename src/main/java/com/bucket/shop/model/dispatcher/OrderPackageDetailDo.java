package com.bucket.shop.model.dispatcher;

import java.io.Serializable;
import java.util.Date;

/**
 * @purpose 包裹单实体明细
 * @description Created by xuzhouwang@qccr.com on 2016/6/22.
 */
public class OrderPackageDetailDo implements Serializable {
    private static final long serialVersionUID = 4346039972676891795L;
    private Long              id;
    private Long              deliveryPackageId;                      //包裹id
    private String            deliveryPackageNo;                      //包裹单号
    private Long              orderId;                                //订单号
    private Long              afterSaleId;                            //售后订单id
    private Long              skuOrderId;                             //goodsSkuOrder id
    private Long              skuId;                                  //skuId
    private String            skuNo;                                  //sku单号
    private String            skuName;                                //sku名称
    private Integer           skuNum;                                 //sku数量
    private Date              createTime;                             //创建时间
    private String            createPerson;                           //创建人
    private Date              updateTime;                             //更新时间
    private String            updatePerson;                           //更新人
    private String            img;                                    //sku图片路径

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getDeliveryPackageId() {
        return deliveryPackageId;
    }

    public void setDeliveryPackageId(Long deliveryPackageId) {
        this.deliveryPackageId = deliveryPackageId;
    }

    public String getDeliveryPackageNo() {
        return deliveryPackageNo;
    }

    public void setDeliveryPackageNo(String deliveryPackageNo) {
        this.deliveryPackageNo = deliveryPackageNo;
    }

    public Long getAfterSaleId() {
        return afterSaleId;
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public Long getSkuOrderId() {
        return skuOrderId;
    }

    public void setSkuOrderId(Long skuOrderId) {
        this.skuOrderId = skuOrderId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
