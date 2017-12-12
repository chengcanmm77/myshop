package com.bucket.shop.service.goods.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bucket.shop.common.so.item.category.CategorySo;
import com.bucket.shop.common.util.ConvetorUtil;
import com.bucket.shop.common.vo.item.category.CategoryVo;
import com.bucket.shop.dal.dao.item.category.CategoryDao;
import com.bucket.shop.model.dbo.goods.category.CategoryDo;
import com.bucket.shop.service.goods.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    @Override
    public CategoryVo createCategory(CategoryVo vo) {
        CategoryDo cdo = ConvetorUtil.conveter(vo, CategoryDo.class);
        categoryDao.insert(cdo);
        CategoryVo newVo = ConvetorUtil.conveter(cdo, CategoryVo.class);
        return newVo;
    }

    @Override
    public CategoryVo udpate(CategoryVo vo) {
        categoryDao.update(vo);
        return vo;
    }

    @Override
    public Integer deleteById(Long id) {
        return categoryDao.delete(id);
    }

    @Override
    public CategoryVo queryById(Long id) {
        return categoryDao.queryCategoryVoById(id);
    }

    @Override
    public List<CategoryVo> queryList(CategorySo so) {
        return categoryDao.queryCategoryVoList(so);
    }

}
