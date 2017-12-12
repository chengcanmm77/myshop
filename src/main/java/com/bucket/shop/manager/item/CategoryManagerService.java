package com.bucket.shop.manager.item;

import java.util.List;

import com.bucket.shop.model.dbo.item.category.CategoryDo;
import com.bucket.shop.model.request.goods.CategoryManagerQueryRequest;

public interface CategoryManagerService {

	public Long insertCategory(CategoryDo categoryDo);

	public Long updateCategory(CategoryDo categoryDo);

	public Long deleteCategory(CategoryDo categoryDo);

	public List<CategoryDo> queryCategory(CategoryManagerQueryRequest queryRequest);

	public Long queryCategorySize(CategoryManagerQueryRequest queryRequest);

	public Long updateCategoryShowById(CategoryDo facadeCategoryDO);

	public Boolean updateCategoryOrderByIds(List<CategoryDo> facadeCategoryDOs);

	public CategoryDo queryCategoryById(Integer facadeCategoryId);

	public List<Integer> queryCategoryOrders(CategoryManagerQueryRequest queryRequest);
}
