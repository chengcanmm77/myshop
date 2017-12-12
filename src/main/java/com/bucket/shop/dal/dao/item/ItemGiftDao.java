package com.bucket.shop.dal.dao.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.ItemGiftSo;
import com.bucket.shop.common.vo.item.ItemGiftVo;
import com.bucket.shop.dal.mapper.item.ItemGiftMapper;
import com.bucket.shop.model.dbo.item.ItemGiftDo;

@Repository
public class ItemGiftDao {

    @Resource
    private ItemGiftMapper itemGiftMapper;

    public long insert(ItemGiftDo itemGiftDo) {
        return itemGiftMapper.insert(itemGiftDo);
    }

    public long update(ItemGiftDo itemDo) {
        return itemGiftMapper.update(itemDo);
    }

    public int delete(Long id) {
        return itemGiftMapper.delete(id);
    }

    public int delete(ItemGiftSo so) {
        return itemGiftMapper.delete(so);
    }

    public ItemGiftDo queryItemGiftDoById(Long id) {
        return itemGiftMapper.queryItemGiftDoById(id);
    }

    public ItemGiftVo queryItemGiftVoById(Long id) {
        return itemGiftMapper.queryItemGiftVoById(id);
    }

    public List<ItemGiftDo> queryItemGiftDoList(ItemGiftSo so) {
        return itemGiftMapper.queryItemDoList(so);
    }

    public List<ItemGiftVo> queryItemGiftVoList(ItemGiftSo so) {
        return itemGiftMapper.queryItemGiftVoList(so);
    }
}
