package com.bucket.shop.dal.dao.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.ItemSo;
import com.bucket.shop.common.vo.item.ItemVo;
import com.bucket.shop.dal.mapper.item.ItemMapper;
import com.bucket.shop.model.item.ItemDo;

@Repository
public class ItemDao {

    @Resource
    private ItemMapper itemMapper;

    public long insert(ItemDo itemDo) {
        return itemMapper.insert(itemDo);
    }

    public long update(ItemDo itemDo) {
        return itemMapper.update(itemDo);
    }

    public int delete(Long id) {
        return itemMapper.delete(id);
    }

    public int delete(ItemSo so) {
        return itemMapper.delete(so);
    }

    public ItemDo queryItemDoById(Long id) {
        return itemMapper.queryItemDoById(id);
    }

    public ItemVo queryItemVoById(Long id) {
        return itemMapper.queryItemVoById(id);
    }

    public List<ItemDo> queryItemDoList(ItemSo so) {
        return itemMapper.queryItemDoList(so);
    }

    public List<ItemVo> queryItemVoList(ItemSo so) {
        return itemMapper.queryItemVoList(so);
    }
}
