package com.bucket.shop.dal.mapper.item.brand;

import java.util.List;

import com.bucket.shop.common.so.item.brand.BrandSo;
import com.bucket.shop.common.vo.item.brand.BrandVo;
import com.bucket.shop.model.dbo.item.brand.BrandDo;

public interface BrandMapper {

    public long insert(BrandDo brand);

    public long update(BrandDo brand);

    public int delete(Long id);

    public int delete(BrandSo so);

    public BrandDo queryBrandDoById(Long id);

    public BrandVo queryBrandVoById(Long id);

    public List<BrandDo> queryBrandDoList(BrandSo so);

    public List<BrandVo> queryBrandVoList(BrandSo so);
}
