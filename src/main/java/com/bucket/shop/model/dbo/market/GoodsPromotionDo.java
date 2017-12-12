package com.bucket.shop.model.dbo.market;

import java.util.Date;
import java.util.List;

import com.bucket.shop.model.dbo.BaseDo;

public class GoodsPromotionDo extends BaseDo {

    /** uid */
    private static final long       serialVersionUID = -1411745765201453887L;
    /** 促销活动业务主键id */
    private Long                    id;
    /** 活动名称 */
    private String                  name;
    /**  活动类型（1:整点促；2：天天抢购）*/
    private Integer                 promotionType;
    /** 活动类型（1.商品；2.门店服务；3.保养优惠套餐；4.保养项目活动） */
    private Integer                 type;
    /** 优惠形式（1.优惠价；2.折扣） */
    private Integer                 style;
    /** 活动状态（0.待审核；1.上线；2.下线；3.审核不通过） */
    private Integer                 status;
    /**活动类型( 1:整点促销商品活动,2:天天抢购促销活动)*/
    private Integer                 newPromotionType;
    /** 活动开始时间 */
    private Date                    startTime;
    /** 活动结束时间 */
    private Date                    endTime;
    /** 活动平台（1.app；2.web）可同时支持多个平台。格式：逗号开始逗号结束，例如,1,2, */
    private String                  supportPlatform;
    /**
     * 活动平台
     * <pre>
     * 1.APP；2.WEB
     * 参考GoodsPromotionSupportPlatform使用
     * </pre>
     */
    private transient List<Integer> supportPlatformList;
    /** 活动图片 */
    private String                  imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNewPromotionType() {
        return newPromotionType;
    }

    public void setNewPromotionType(Integer newPromotionType) {
        this.newPromotionType = newPromotionType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSupportPlatform() {
        return supportPlatform;
    }

    public void setSupportPlatform(String supportPlatform) {
        this.supportPlatform = supportPlatform;
    }

    public List<Integer> getSupportPlatformList() {
        return supportPlatformList;
    }

    public void setSupportPlatformList(List<Integer> supportPlatformList) {
        this.supportPlatformList = supportPlatformList;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
