package com.bucket.shop.service.item.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;

import com.bucket.shop.common.so.item.brand.BrandSo;
import com.bucket.shop.common.util.ConvetorUtil;
import com.bucket.shop.common.vo.item.brand.BrandVo;
import com.bucket.shop.dal.dao.item.brand.BrandDao;
import com.bucket.shop.model.item.brand.BrandDo;
import com.bucket.shop.service.item.BrandService;

public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandDao brandDao;

    @Override
    public BrandVo createBrand(BrandVo brandVo) {
        if (brandVo == null) {

        }

        if (StringUtils.isBlank(brandVo.getBrandName())) {

        }

        BrandDo bdo = ConvetorUtil.conveter(brandVo, BrandDo.class);
        brandDao.insert(bdo);

        BrandVo newVo = ConvetorUtil.conveter(bdo, BrandVo.class);
        return newVo;
    }

    @Override
    public BrandVo updateBrand(BrandVo brandVo) {
        BrandDo bdo = ConvetorUtil.conveter(brandVo, BrandDo.class);
        brandDao.update(bdo);
        return ConvetorUtil.conveter(bdo, BrandVo.class);
    }

    @Override
    public Integer deleteBrandById(Long id) {
        return brandDao.delete(id);
    }

    @Override
    public BrandVo queryBrandById(Long id) {
        return brandDao.queryBrandVoById(id);
    }

    @Override
    public List<BrandVo> queryBrandList(BrandSo so) {
        return brandDao.queryBrandVoList(so);
    }

}
