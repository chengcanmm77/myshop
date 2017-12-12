package com.bucket.shop.service.goods.item;

import java.util.List;

import com.bucket.shop.common.so.item.ItemSo;
import com.bucket.shop.common.vo.item.ItemVo;

/**
 * 商品相关业务类
 * @author user
 *
 */
public interface ItemService {

    /**
     * 新增商品
     * @param vo
     * @return
     * @date: 2016年11月21日 上午10:59:13
     */
    public ItemVo createItem(ItemVo vo);

    /**
     * 更新商品
     * @param vo
     * @return
     * @date: 2016年11月21日 上午10:59:53
     */
    public ItemVo updateUpdateItem(ItemVo vo);

    /**
     * 根据商品id查询商品
     * @param itemId
     * @return
     * @date: 2016年11月21日 上午11:00:31
     */
    public ItemVo getItemById(Long itemId);

    /**
     * 根据code查询商品
     * @param code
     * @return
     * @date: 2016年11月21日 上午11:03:52
     */
    public ItemVo getItemByCode(String code);

    /**
     * 查询商品列表
     * @param so
     * @return
     * @date: 2016年11月21日 上午11:03:05
     */
    public List<ItemVo> queryItemList(ItemSo so);

    /**
     * 
     * @description:更新上下架状态
     * @param map
     * @return
     * @date: 2015年12月29日 下午10:35:54
     */
    public Integer updateOnMarketable(ItemVo vo);

    /**
     * 批量更新上下架状态
     * @param items
     * @return
     * @date: 2016年7月26日 下午10:11:00
     */
    public Integer batchUpdateOnMarketable(List<ItemVo> items);

    /**
     * 
     * @description:逻辑删除商品
     * @param itemId
     * @return
     * @date: 2015年12月30日 上午9:31:34
     */
    public Integer deleteItem(ItemSo so);
}
