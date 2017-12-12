package com.bucket.shop.dal.dao.item.category;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.category.CategorySo;
import com.bucket.shop.common.vo.item.category.CategoryVo;
import com.bucket.shop.dal.mapper.item.category.CategoryMapper;
import com.bucket.shop.model.dbo.goods.category.CategoryDo;

@Repository
public class CategoryDao {

    @Resource
    private CategoryMapper categoryMapper;

    public long insert(CategoryDo category) {
        return categoryMapper.insert(category);
    }

    public long update(CategoryVo category) {
        return categoryMapper.update(category);
    }

    public int delete(Long id) {
        return categoryMapper.delete(id);
    }

    public int delete(CategorySo so) {
        return categoryMapper.delete(so);
    }

    public CategoryDo querySkuAttrDoById(Long id) {
        return categoryMapper.queryCategoryDoById(id);
    }

    public CategoryVo queryCategoryVoById(Long id) {
        return categoryMapper.queryCategoryVoById(id);
    }

    public List<CategoryDo> queryCategoryDoList(CategorySo so) {
        return categoryMapper.queryCategoryDoList(so);
    }

    public List<CategoryVo> queryCategoryVoList(CategorySo so) {
        return categoryMapper.queryCategoryVoList(so);
    }
}
