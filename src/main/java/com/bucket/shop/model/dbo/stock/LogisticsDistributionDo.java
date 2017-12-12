package com.bucket.shop.model.dbo.stock;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 物流公司的配送信息
 * @author wangchengxian
 *
 */
public class LogisticsDistributionDo extends BaseDo {

    /**BooleanMutex
     * 
     */
    private static final long serialVersionUID = 1076325583356468309L;
    private long              logisticsId;                            //物流公司ID
    private String[]          areacodes;                              //配送区域代码
    private String[]          areas;                                  // 配送区域
    private int               priority;                               // 优先级
    private Float             weightFirst;                            //首重
    private Float             weightFirstFee;                         // 首重费
    private Float             weightContinue;                         // 续重
    private Float             weightContinueFee;                      // 续重费
    private Float             bulkFirst;                              // 首体积
    private Float             bulkFirstFee;                           // 首体积费
    private Float             bulkContinue;                           // 续体积
    private Float             bulkContinueFee;                        // 体积续费

    public long getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String[] getAreacodes() {
        return areacodes;
    }

    public void setAreacodes(String[] areacodes) {
        this.areacodes = areacodes;
    }

    public String[] getAreas() {
        return areas;
    }

    public void setAreas(String[] areas) {
        this.areas = areas;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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

}
