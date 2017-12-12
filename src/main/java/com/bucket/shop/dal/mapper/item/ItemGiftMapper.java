package com.bucket.shop.dal.mapper.item;

import java.util.List;

import com.bucket.shop.common.so.item.ItemGiftSo;
import com.bucket.shop.common.vo.item.ItemGiftVo;
import com.bucket.shop.model.dbo.goods.ItemGiftDo;

public interface ItemGiftMapper {

    public long insert(ItemGiftDo itemGiftDo);

    public long update(ItemGiftDo itemDo);

    public int delete(Long id);

    public int delete(ItemGiftSo so);

    public ItemGiftDo queryItemGiftDoById(Long id);

    public ItemGiftVo queryItemGiftVoById(Long id);

    public List<ItemGiftDo> queryItemDoList(ItemGiftSo so);

    public List<ItemGiftVo> queryItemGiftVoList(ItemGiftSo so);
}
