package com.bucket.shop.service.goods.item.impl;

import java.util.List;

import com.bucket.shop.common.util.ConvetorUtil;
import com.bucket.shop.common.vo.item.ItemGiftVo;
import com.bucket.shop.dal.dao.item.ItemGiftDao;
import com.bucket.shop.model.item.ItemGiftDo;
import com.bucket.shop.service.goods.item.ItemGiftService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemGiftServiceImpl implements ItemGiftService {

    @Resource
    private ItemGiftDao itemGiftDao;

    @Override
    public Integer insert(ItemGiftVo vo) {
        ItemGiftDo itemGiftDo = ConvetorUtil.conveter(vo, ItemGiftDo.class);
        itemGiftDao.insert(itemGiftDo);
        return null;
    }

    @Override
    public Integer insert(List<ItemGiftVo> vos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer update(ItemGiftVo itemGiftVo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer delete(Integer itemId) {
        itemGiftDao.delete((long)itemId);
        return null;
    }

    @Override
    public List<ItemGiftVo> queryGiftByItemId(Integer itemId) {
        // TODO Auto-generated method stub
        return null;
    }

}
