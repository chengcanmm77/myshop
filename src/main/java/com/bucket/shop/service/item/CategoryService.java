package com.bucket.shop.service.item;

import java.util.List;

import com.bucket.shop.common.so.item.category.CategorySo;
import com.bucket.shop.common.vo.item.category.CategoryVo;

public interface CategoryService {

    public CategoryVo createCategory(CategoryVo vo);

    public CategoryVo udpate(CategoryVo vo);

    public Integer deleteById(Long id);

    public CategoryVo queryById(Long id);

    public List<CategoryVo> queryList(CategorySo so);
}
