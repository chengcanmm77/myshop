package com.bucket.shop.service.goods;

import java.util.List;

import com.bucket.shop.common.so.item.brand.BrandSo;
import com.bucket.shop.common.vo.item.brand.BrandVo;

public interface BrandService {

    public BrandVo createBrand(BrandVo brandVo);

    public BrandVo updateBrand(BrandVo brandVo);

    public Integer deleteBrandById(Long id);

    public BrandVo queryBrandById(Long id);

    public List<BrandVo> queryBrandList(BrandSo so);
}
