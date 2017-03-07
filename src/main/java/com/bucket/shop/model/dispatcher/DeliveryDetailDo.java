package com.bucket.shop.model.dispatcher;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.bucket.shop.model.BaseDo;

/**
 * @purpose 发货管理：发货单sku明细
 * @description Created by xuzhouwang@qccr.com on 2016/6/24.
 */
@Alias(value = "DeliverySkuDo")
public class DeliveryDetailDo extends BaseDo {
    /**
     * 
     */
    private static final long serialVersionUID = 5414018178193096744L;
    /**
     * sku明细id
     */
    private Long              id;                                     //
    /**
     * 发货通知单id
     */
    private Long              noticeId;                               //
    /**
     * 销售订单id
     */
    private Long              orderId;
    /**
     * goodsskuorder表主键id
     */
    private Long              skuOrderId;
    /**
     * skuId
     */
    private Long              skuId;
    /**
     * sku编码
     */
    private String            skuNo;
    /**
     * sku数量
     */
    private Integer           skuNum;
    /**
     * sku单位
     */
    private String            skuUnit;
    /**
     * sku重量
     */
    private String            skuWeight;
    /**
     * 类别id
     */
    private Integer           categoryId;
    /**
     * 类别名称
     */
    private String            categoryName;
    /**
     * 赠品标志
     */
    private Integer           giftFlag;
    /**
     * 创建时间
     */
    private Date              createTime;                             //
    /**
     * 更新时间
     */
    private Date              updateTime;
    /**
     * 创建人
     */
    private String            createPerson;
    /**
     * 更新人
     */
    private String            updatePerson;
    /**
     * 来源平台
     */
    private Integer           source;
    /**
     * 店铺名称
     */
    private String            shopName;
    /**
     * 销售应付价
     */
    private Integer           skuCost;

    private Long              goodsSkuId;                             //GoodsSkuOrder表记录id

    private String            skuName;                                //新增sku名称

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getShopName() {
        return shopName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSkuOrderId() {
        return skuOrderId;
    }

    public void setSkuOrderId(Long skuOrderId) {
        this.skuOrderId = skuOrderId;
    }

    public Integer getSkuCost() {
        return skuCost;
    }

    public void setSkuCost(Integer skuCost) {
        this.skuCost = skuCost;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public String getSkuUnit() {
        return skuUnit;
    }

    public void setSkuUnit(String skuUnit) {
        this.skuUnit = skuUnit;
    }

    public String getSkuWeight() {
        return skuWeight;
    }

    public void setSkuWeight(String skuWeight) {
        this.skuWeight = skuWeight;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getGiftFlag() {
        return giftFlag;
    }

    public void setGiftFlag(Integer giftFlag) {
        this.giftFlag = giftFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    @Override
    public String toString() {
        return "DeliverySkuDo [id=" + id + ", noticeId=" + noticeId + ", orderId=" + orderId
               + ", skuOrderId=" + skuOrderId + ", skuId=" + skuId + ", skuNo=" + skuNo
               + ", skuNum=" + skuNum + ", skuUnit=" + skuUnit + ", skuWeight=" + skuWeight
               + ", categoryId=" + categoryId + ", categoryName=" + categoryName + ", giftFlag="
               + giftFlag + ", createTime=" + createTime + ", updateTime=" + updateTime
               + ", createPerson=" + createPerson + ", updatePerson=" + updatePerson + ", source="
               + source + ", shopName=" + shopName + ", skuCost=" + skuCost + ", goodsSkuId="
               + goodsSkuId + "]";
    }

}
