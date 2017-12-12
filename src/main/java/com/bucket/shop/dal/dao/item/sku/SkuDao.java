package com.bucket.shop.dal.dao.item.sku;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.sku.SkuSo;
import com.bucket.shop.common.vo.item.sku.SkuVo;
import com.bucket.shop.dal.mapper.item.sku.SkuMapper;
import com.bucket.shop.model.dbo.item.sku.SkuDo;

@Repository
public class SkuDao {

    @Resource
    private SkuMapper skuMapper;

    public long insert(SkuDo skuDo) {
        return skuMapper.insert(skuDo);
    }

    public long update(SkuDo skuDo) {
        return skuMapper.update(skuDo);
    }

    public int delete(Long id) {
        return skuMapper.delete(id);
    }

    public int delete(SkuSo so) {
        return skuMapper.delete(so);
    }

    public SkuDo querySkuDoById(Long id) {
        return skuMapper.querySkuDoById(id);
    }

    public SkuVo querySkuVoById(Long id) {
        return skuMapper.querySkuVoById(id);
    }

    public List<SkuDo> querySkuDoList(SkuSo so) {
        return skuMapper.querySkuDoList(so);
    }

    public List<SkuVo> querySkuVoList(SkuSo so) {
        return skuMapper.querySkuVoList(so);
    }
}
