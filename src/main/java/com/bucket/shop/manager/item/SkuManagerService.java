package com.bucket.shop.manager.item;

import java.util.List;

import com.bucket.shop.model.request.goods.SkuQueryRequest;
import com.bucket.shop.model.ro.goods.SkuRo;


public interface SkuManagerService {

	/**
	 * 新增sku,包括sku基础信息， sku属性，sku图片
	 * @param SkuRO
	 */
	public Long insertSkuInfo(SkuRo skuRo);
	/**
	 * sku修改
	 */
	public Boolean updateSkuRefInfo(SkuRo skuRo);
	
	/**
	 * 获取sku信息
	 * @param skuId
	 */
	public SkuRo queryBySkuId(Integer skuId);
	/**
	 * 获取sku列表（无分页）
	 * @param queryOption
	 * @return
	 * @date: 2015年12月14日 下午3:42:25
	 */
	public List<SkuRo> querySkuList(SkuQueryRequest queryRequest);
	/**  
	 * @param brandCode
	 * @param isBaseSku 是否基准SKU
	 * @return
	 * @date: 2016年1月5日 下午2:11:51
	 */
	public String generateSkuCode(String brandCode, boolean isBaseSku);
	
	/**
	 * 根据sku编码查询sku
	 */
    public SkuRo querySkuBySkuCode(SkuRo skuRO);
}
