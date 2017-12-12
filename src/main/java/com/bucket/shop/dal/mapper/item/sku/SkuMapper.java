package com.bucket.shop.dal.mapper.item.sku;

import java.util.List;

import com.bucket.shop.common.so.item.sku.SkuSo;
import com.bucket.shop.common.vo.item.sku.SkuVo;
import com.bucket.shop.model.dbo.item.sku.SkuDo;

public interface SkuMapper {

    public long insert(SkuDo skuDo);

    public long update(SkuDo skuDo);

    public int delete(Long id);

    public int delete(SkuSo so);

    public SkuDo querySkuDoById(Long id);

    public SkuVo querySkuVoById(Long id);

    public List<SkuDo> querySkuDoList(SkuSo so);

    public List<SkuVo> querySkuVoList(SkuSo so);
}
