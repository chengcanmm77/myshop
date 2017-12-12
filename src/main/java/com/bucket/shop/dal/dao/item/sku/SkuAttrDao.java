package com.bucket.shop.dal.dao.item.sku;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.sku.SkuAttrSo;
import com.bucket.shop.common.vo.item.sku.SkuAttrVo;
import com.bucket.shop.dal.mapper.item.sku.SkuAttrMapper;
import com.bucket.shop.model.dbo.item.sku.SkuAttrDo;

@Repository
public class SkuAttrDao {

    @Resource
    private SkuAttrMapper skuAttrMapper;

    public long insert(SkuAttrDo skuAttr) {
        return skuAttrMapper.insert(skuAttr);
    }

    public long update(SkuAttrDo skuAttr) {
        return skuAttrMapper.update(skuAttr);
    }

    public int delete(Long id) {
        return skuAttrMapper.delete(id);
    }

    public int delete(SkuAttrSo so) {
        return skuAttrMapper.delete(so);
    }

    public SkuAttrDo querySkuAttrDoById(Long id) {
        return skuAttrMapper.querySkuAttrDoById(id);
    }

    public SkuAttrVo querySkuAttrVoById(Long id) {
        return skuAttrMapper.querySkuAttrVoById(id);
    }

    public List<SkuAttrDo> querySkuAttrDoList(SkuAttrSo so) {
        return skuAttrMapper.querySkuAttrDoList(so);
    }

    public List<SkuAttrVo> querySkuAttrVoList(SkuAttrSo so) {
        return skuAttrMapper.querySkuAttrVoList(so);
    }
}
