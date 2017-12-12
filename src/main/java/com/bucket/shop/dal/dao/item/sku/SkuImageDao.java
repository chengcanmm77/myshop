package com.bucket.shop.dal.dao.item.sku;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.sku.SkuImageSo;
import com.bucket.shop.common.vo.item.sku.SkuImageVo;
import com.bucket.shop.dal.mapper.item.sku.SkuImageMapper;
import com.bucket.shop.model.dbo.goods.sku.SkuImageDo;

@Repository
public class SkuImageDao {

    @Resource
    private SkuImageMapper skuImageMapper;

    public long insert(SkuImageDo skuImageDo) {
        return skuImageMapper.insert(skuImageDo);
    }

    public long update(SkuImageDo skuImageDo) {
        return skuImageMapper.update(skuImageDo);
    }

    public int delete(Long id) {
        return skuImageMapper.delete(id);
    }

    public int delete(SkuImageSo so) {
        return skuImageMapper.delete(so);
    }

    public SkuImageDo querySkuImageById(Long id) {
        return skuImageMapper.querySkuImageById(id);
    }

    public SkuImageVo querySkuImageVoById(Long id) {
        return skuImageMapper.querySkuImageVoById(id);
    }

    public List<SkuImageDo> querySkuImageDoList(SkuImageSo so) {
        return skuImageMapper.querySkuImageDoList(so);
    }

    public List<SkuImageVo> querySkuImageVoList(SkuImageSo so) {
        return skuImageMapper.querySkuImageVoList(so);
    }
}
