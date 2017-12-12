package com.bucket.shop.service.goods.item.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bucket.shop.common.so.item.ItemSo;
import com.bucket.shop.common.util.ConvetorUtil;
import com.bucket.shop.common.vo.item.ItemVo;
import com.bucket.shop.dal.dao.item.ItemDao;
import com.bucket.shop.dal.dao.item.ItemGiftDao;
import com.bucket.shop.dal.dao.item.ItemImageDao;
import com.bucket.shop.model.dbo.goods.ItemDo;
import com.bucket.shop.service.goods.item.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemDao      itemDao;
    @Resource
    private ItemGiftDao  itemGiftDao;
    @Resource
    private ItemImageDao itemImageDao;

    @Override
    public ItemVo createItem(ItemVo vo) {
        ItemDo itemDo = ConvetorUtil.conveter(vo, ItemDo.class);
        itemDao.insert(itemDo);
        ItemVo newVo = ConvetorUtil.conveter(itemDo, ItemVo.class);
        return newVo;
    }

    @Override
    public ItemVo updateUpdateItem(ItemVo vo) {
    	ItemDo itemDo = ConvetorUtil.conveter(vo, ItemDo.class);
    	itemDao.update(itemDo);
        return vo;
    }

    @Override
    public ItemVo getItemById(Long itemId) {
        return itemDao.queryItemVoById(itemId);
    }

    @Override
    public ItemVo getItemByCode(String code) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ItemVo> queryItemList(ItemSo so) {
        return itemDao.queryItemVoList(so);
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
        return itemDao.delete(so);
    }

}
