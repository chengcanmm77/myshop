package com.bucket.shop.service.item.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bucket.shop.common.so.item.ItemSo;
import com.bucket.shop.common.vo.item.ItemVo;
import com.bucket.shop.dal.dao.item.ItemDao;
import com.bucket.shop.dal.dao.item.ItemGiftDao;
import com.bucket.shop.dal.dao.item.ItemImageDao;
import com.bucket.shop.service.item.ItemService;

public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemDao      itemDao;
    @Resource
    private ItemGiftDao  itemGiftDao;
    @Resource
    private ItemImageDao itemImageDao;

    @Override
    public ItemVo createItem(ItemVo vo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ItemVo updateUpdateItem(ItemVo vo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ItemVo getItemById(Long itemId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ItemVo getItemByCode(String code) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ItemVo> queryItemList(ItemSo so) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer updateOnMarketable(ItemVo vo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer batchUpdateOnMarketable(List<ItemVo> items) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer deleteItem(ItemSo so) {
        // TODO Auto-generated method stub
        return null;
    }

}
