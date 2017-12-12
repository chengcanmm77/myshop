package com.bucket.shop.dal.mapper.item.category;

import java.util.List;

import com.bucket.shop.common.so.item.category.CategorySo;
import com.bucket.shop.common.vo.item.category.CategoryVo;
import com.bucket.shop.model.dbo.goods.category.CategoryDo;

public interface CategoryMapper {

    public long insert(CategoryDo category);

    public long update(CategoryVo category);

    public int delete(Long id);

    public int delete(CategorySo so);

    public CategoryDo queryCategoryDoById(Long id);

    public CategoryVo queryCategoryVoById(Long id);

    public List<CategoryDo> queryCategoryDoList(CategorySo so);

    public List<CategoryVo> queryCategoryVoList(CategorySo so);
}
