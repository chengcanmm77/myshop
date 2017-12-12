package com.bucket.shop.manager.item;

import java.util.List;
import com.bucket.shop.common.vo.item.brand.BrandVo;
import com.bucket.shop.model.dbo.item.brand.BrandDo;
import com.bucket.shop.model.request.goods.BrandManagerQueryRequest;

public interface BrandManagerService {

	public BrandVo queryByBrandId(Long brandId);

	public List<BrandVo> queryByBrandIds(List<Long> brandIds);

	public List<BrandVo> queryBrandList(BrandManagerQueryRequest queryRequest);

	public List<BrandDo> queryBrandListUnderCategory(Integer categoryId, Integer status);

	public Integer insertBrand(BrandVo record);

	public Integer updateBrand(BrandVo record);

	public Boolean isExistSameName(BrandVo brandVo);

	public Boolean isExistSameCode(BrandVo brandVo);

	public Integer queryBrandListCount(BrandManagerQueryRequest queryRequest);

	public Integer updateStatus(BrandVo brandVo);
}
