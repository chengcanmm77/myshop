package com.bucket.shop.dal.mapper.item.attribute;

import java.util.List;

import com.bucket.shop.common.so.item.attribute.AttributeNameSo;
import com.bucket.shop.common.vo.item.attribute.AttributeNameVo;
import com.bucket.shop.model.dbo.item.attribute.AttributeNameDo;

public interface AttributeNameMapper {

    public long insert(AttributeNameDo attributeNameDo);

    public long update(AttributeNameDo itemDo);

    public int delete(Long id);

    public int delete(AttributeNameSo so);

    public AttributeNameDo queryDoById(Long id);

    public AttributeNameVo queryVoById(Long id);

    public List<AttributeNameDo> queryDoList(AttributeNameSo so);

    public List<AttributeNameVo> queryVoList(AttributeNameSo so);
}
