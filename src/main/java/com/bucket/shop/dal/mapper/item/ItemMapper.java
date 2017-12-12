package com.bucket.shop.dal.mapper.item;

import java.util.List;

import com.bucket.shop.common.so.item.ItemSo;
import com.bucket.shop.common.vo.item.ItemVo;
import com.bucket.shop.model.dbo.goods.ItemDo;

public interface ItemMapper {

    public long insert(ItemDo itemDo);

    public long update(ItemDo itemDo);

    public int delete(Long id);

    public int delete(ItemSo so);

    public ItemDo queryItemDoById(Long id);

    public ItemVo queryItemVoById(Long id);

    public List<ItemDo> queryItemDoList(ItemSo so);

    public List<ItemVo> queryItemVoList(ItemSo so);
}
