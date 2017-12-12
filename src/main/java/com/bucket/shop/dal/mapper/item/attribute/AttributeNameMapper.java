package com.bucket.shop.dal.mapper.item.attribute;

import java.util.List;
import java.util.Map;

import com.bucket.shop.common.so.item.attribute.AttributeNameSo;
import com.bucket.shop.model.dbo.goods.attribute.AttributeNameDo;

public interface AttributeNameMapper {

    public long insert(AttributeNameDo attributeNameDo);

    public long update(AttributeNameDo itemDo);

    public int delete(Long id);

    public int delete(AttributeNameSo so);

    public AttributeNameDo queryDoById(Long id);

    public List<AttributeNameDo> queryByCategoryIds(Map<String,Object> map);

}
