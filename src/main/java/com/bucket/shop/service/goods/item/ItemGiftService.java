package com.bucket.shop.service.goods.item;

import java.util.List;

import com.bucket.shop.common.vo.item.ItemGiftVo;

public interface ItemGiftService {

    /**
     * 新增赠品关联信息
     * @param ItemGiftVo
     * @return
     * @date: 2015年12月28日 下午1:59:57
     */
    public Integer insert(ItemGiftVo vo);

    /**
     * 批量赠品关联信息
     * @param List<ItemGiftVo>
     * @return
     * @date: 2015年12月28日 下午1:59:57
     */
    public Integer insert(List<ItemGiftVo> vos);

    /**
     * 更新商品关联信息
     * @param itemGiftVo
     * @return
     * @date: 2015年12月28日 下午2:00:21
     */
    public Integer update(ItemGiftVo itemGiftVo);

    /**
     * 商品赠品关联信息
     * @param itemId
     * @return
     * @date: 2015年12月28日 下午2:01:02
     */
    public Integer delete(Integer itemId);

    /**
     * 查询商品的赠品
     * @param itemId
     * @return
     * @date: 2015年12月28日 下午2:01:29
     */
    public List<ItemGiftVo> queryGiftByItemId(Integer itemId);
}
