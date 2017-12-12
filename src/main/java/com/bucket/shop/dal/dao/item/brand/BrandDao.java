package com.bucket.shop.dal.dao.item.brand;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.brand.BrandSo;
import com.bucket.shop.common.vo.item.brand.BrandVo;
import com.bucket.shop.dal.mapper.item.brand.BrandMapper;
import com.bucket.shop.model.dbo.goods.brand.BrandDo;

@Repository
public class BrandDao {

    @Resource
    private BrandMapper brandMapper;

    public long insert(BrandDo brand) {
        return brandMapper.insert(brand);
    }

    public long update(BrandDo brand) {
        return brandMapper.update(brand);
    }

    public int delete(Long id) {
        return brandMapper.delete(id);
    }

    public int delete(BrandSo so) {
        return brandMapper.delete(so);
    }

    public BrandDo queryBrandDoById(Long id) {
        return brandMapper.queryBrandDoById(id);
    }

    public BrandVo queryBrandVoById(Long id) {
        return brandMapper.queryBrandVoById(id);
    }

    public List<BrandDo> queryBrandDoList(BrandSo so) {
        return brandMapper.queryBrandDoList(so);
    }

    public List<BrandVo> queryBrandVoList(BrandSo so) {
        return brandMapper.queryBrandVoList(so);
    }
}
