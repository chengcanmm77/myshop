package com.bucket.shop.dal.mapper.item;

import java.util.List;

import com.bucket.shop.common.so.item.ItemImageSo;
import com.bucket.shop.common.vo.item.ItemImageVo;
import com.bucket.shop.model.dbo.goods.ItemImageDo;

public interface ItemImageMapper {

    public long insert(ItemImageDo itemGiftDo);

    public long update(ItemImageDo itemDo);

    public int delete(Long id);

    public int delete(ItemImageSo so);

    public ItemImageDo queryItemImageDoById(Long id);

    public ItemImageVo queryItemImageVoById(Long id);

    public List<ItemImageDo> queryItemImageDoList(ItemImageSo so);

    public List<ItemImageVo> queryItemImageVoList(ItemImageSo so);
}
