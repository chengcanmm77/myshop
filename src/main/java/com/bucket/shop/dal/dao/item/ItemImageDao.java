package com.bucket.shop.dal.dao.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.common.so.item.ItemImageSo;
import com.bucket.shop.common.vo.item.ItemImageVo;
import com.bucket.shop.dal.mapper.item.ItemImageMapper;
import com.bucket.shop.model.dbo.item.ItemImageDo;

@Repository
public class ItemImageDao {
    @Resource
    private ItemImageMapper itemImageMapper;

    public long insert(ItemImageDo itemImageDo) {
        return itemImageMapper.insert(itemImageDo);
    }

    public long update(ItemImageDo itemImageDo) {
        return itemImageMapper.update(itemImageDo);
    }

    public int delete(Long id) {
        return itemImageMapper.delete(id);
    }

    public int delete(ItemImageSo so) {
        return itemImageMapper.delete(so);
    }

    public ItemImageDo queryItemImageDoById(Long id) {
        return itemImageMapper.queryItemImageDoById(id);
    }

    public ItemImageVo queryItemImageVoById(Long id) {
        return itemImageMapper.queryItemImageVoById(id);
    }

    public List<ItemImageDo> queryItemImageDoList(ItemImageSo so) {
        return itemImageMapper.queryItemImageDoList(so);
    }

    public List<ItemImageVo> queryItemImageVoList(ItemImageSo so) {
        return itemImageMapper.queryItemImageVoList(so);
    }
}
