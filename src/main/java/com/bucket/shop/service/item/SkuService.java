package com.bucket.shop.service.item;

import java.util.List;

import com.bucket.shop.common.so.item.sku.SkuSo;
import com.bucket.shop.common.vo.item.sku.SkuVo;

public interface SkuService {

	public SkuVo insert(SkuVo vo);
	
	public SkuVo update(SkuVo vo);
	
	public void deleteById(Long id);
	
	public SkuVo queryById(Long id);
	
	public List<SkuVo> queryList(SkuSo so);
}
