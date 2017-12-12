package com.bucket.shop.dal.mapper.item.attribute;

import java.util.List;

import com.bucket.shop.common.so.item.attribute.AttributeValueSo;
import com.bucket.shop.common.vo.item.attribute.AttributeValueVo;
import com.bucket.shop.model.dbo.item.attribute.AttributeValueDo;

public interface AttributeValueMapper {

    public long insert(AttributeValueDo attributeValueDo);

    public long update(AttributeValueDo attributeValueDo);

    public int delete(Long id);

    public int delete(AttributeValueSo so);

    public AttributeValueDo queryDoById(Long id);

    public AttributeValueVo queryVoById(Long id);

    public List<AttributeValueDo> queryDoList(AttributeValueSo so);

    public List<AttributeValueVo> queryVoList(AttributeValueSo so);
}
