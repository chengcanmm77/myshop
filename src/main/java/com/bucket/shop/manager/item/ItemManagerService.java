package com.bucket.shop.manager.item;

import java.util.List;

import com.bucket.shop.model.request.goods.ItemManagerQueryRequest;
import com.bucket.shop.model.ro.goods.CouponItemRo;
import com.bucket.shop.model.ro.goods.ItemPurchaseRo;
import com.bucket.shop.model.ro.goods.ItemRo;
import com.bucket.shop.model.ro.goods.ItemSeoRo;
import com.bucket.shop.model.ro.goods.ItemTagRefRo;


public interface ItemManagerService {

	/**
     * 保存卡券虚拟商品,用于营销
     * 
     * @param couponItemRO
     * @return
     * @date: 2016年6月29日 下午3:12:20
     */
    public ItemRo insertCouponItem(CouponItemRo couponItemRO);

   /**
    * 搜索卡券关联车品的商品列表
    */
    public List<ItemRo> queryCouponAssociateItemList(ItemManagerQueryRequest option);

    /**
     * 保存商品信息
     */
    public Long insertItemRef(ItemRo itemRO);

    /**
     * 修改商品信息
     */
    public Boolean updateItem(ItemRo itemRO);

    /**
     * 
     * 查询管理商品列表
     */
    public List<ItemRo> queryManagerItemList(ItemManagerQueryRequest option);

    /**
     * 
     * @description:更新上下架状态
     */
    public Integer updateOnMarketable(ItemRo itemRO);

    /**
     * 
     * @description:删除商品
     */
    public Integer deleteItem(ItemRo itemRO);

    /**
     * 
     * @description:根据sku编码获得商品编码
     */
    public String getItemSN(String skuNO);

    /**
     * 查询定时限购商品
     * @return
     * @date: 2016年1月11日 下午8:55:17
     */
    public List<ItemRo> queryRepeatCycleItems();


    /**
     * 查询item中的所有的商品
     */
    public List<Long> queryAllItem();

    public ItemRo queryItemByNo(String itemNo);


    /**
     * 根据商品Id查询seo信息
     */
    public ItemSeoRo queryItemSeoByItemId(Integer itemId);

    /**
     * 批量新增商品seo
     */
    public Boolean batchInsertItemSeo(List<ItemSeoRo> itemSeoROList);

    /**
     * 批量修改商品seo
     */
    public Boolean batchUpdateItemSeo(List<ItemSeoRo> itemSeoROList);

    /**  
     * @param itemTagRefROList
     */
    public Boolean batchInsertItemTag(List<ItemTagRefRo> itemTagRefROList);

    /**  
     * @param itemTagRefROList
     */
    public Boolean batchDeleteItemTag(List<ItemTagRefRo> itemTagRefROList);


    /**  
     * 限购
     */
    public Boolean batchUpdateItemPurchase(String token,List<ItemPurchaseRo> itemPurchaseROs);

    /**  
     * @param token
     */
    public List<ItemPurchaseRo> queryItemPurchases(String token);

}
