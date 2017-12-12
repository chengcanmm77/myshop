package com.bucket.shop.model.ro.goods;

import java.io.Serializable;

import com.bucket.shop.model.ro.BaseRo;

public class ItemStatisticRo extends BaseRo implements Serializable{
	private static final long serialVersionUID = -7909388587727640204L;

	/**总评论数*/
    private Integer commentCount;

    /**好评数*/
    private Integer goodCommentCount;

    /**中评数*/
    private Integer mediumCommentCount;

    /**差评数*/
    private Integer badCommentCount;

    /**平均评论得分*/
    private Double  average;

    /**总销量*/
    private Integer saleCount;
    
    /**近三十天销量*/
    private Integer monthSales;
    
    /**近七天销量*/
    private Integer weekSales;

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public Integer getGoodCommentCount() {
		return goodCommentCount;
	}

	public void setGoodCommentCount(Integer goodCommentCount) {
		this.goodCommentCount = goodCommentCount;
	}

	public Integer getMediumCommentCount() {
		return mediumCommentCount;
	}

	public void setMediumCommentCount(Integer mediumCommentCount) {
		this.mediumCommentCount = mediumCommentCount;
	}

	public Integer getBadCommentCount() {
		return badCommentCount;
	}

	public void setBadCommentCount(Integer badCommentCount) {
		this.badCommentCount = badCommentCount;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public Integer getMonthSales() {
		return monthSales;
	}

	public void setMonthSales(Integer monthSales) {
		this.monthSales = monthSales;
	}

	public Integer getWeekSales() {
		return weekSales;
	}

	public void setWeekSales(Integer weekSales) {
		this.weekSales = weekSales;
	}
    
    
}
