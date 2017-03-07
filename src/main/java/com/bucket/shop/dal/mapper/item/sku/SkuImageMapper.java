package com.bucket.shop.dal.mapper.item.sku;

import java.util.List;

import com.bucket.shop.common.so.item.sku.SkuImageSo;
import com.bucket.shop.common.vo.item.sku.SkuImageVo;
import com.bucket.shop.model.item.sku.SkuImageDo;

public interface SkuImageMapper {

    public long insert(SkuImageDo skuImageDo);

    public long update(SkuImageDo skuImageDo);

    public int delete(Long id);

    public int delete(SkuImageSo so);

    public SkuImageDo querySkuImageById(Long id);

    public SkuImageVo querySkuImageVoById(Long id);

    public List<SkuImageDo> querySkuImageDoList(SkuImageSo so);

    public List<SkuImageVo> querySkuImageVoList(SkuImageSo so);
}
