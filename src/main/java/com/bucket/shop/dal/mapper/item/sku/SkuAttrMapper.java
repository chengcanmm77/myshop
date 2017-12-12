package com.bucket.shop.dal.mapper.item.sku;

import java.util.List;

import com.bucket.shop.common.so.item.sku.SkuAttrSo;
import com.bucket.shop.common.vo.item.sku.SkuAttrVo;
import com.bucket.shop.model.dbo.item.sku.SkuAttrDo;

public interface SkuAttrMapper {

    public long insert(SkuAttrDo skuAttr);

    public long update(SkuAttrDo skuAttr);

    public int delete(Long id);

    public int delete(SkuAttrSo so);

    public SkuAttrDo querySkuAttrDoById(Long id);

    public SkuAttrVo querySkuAttrVoById(Long id);

    public List<SkuAttrDo> querySkuAttrDoList(SkuAttrSo so);

    public List<SkuAttrVo> querySkuAttrVoList(SkuAttrSo so);
}
