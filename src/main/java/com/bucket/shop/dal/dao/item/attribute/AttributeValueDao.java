package com.bucket.shop.dal.dao.item.attribute;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.dal.mapper.item.attribute.AttributeValueMapper;

@Repository
public class AttributeValueDao {

    @Resource
    private AttributeValueMapper attributeValueMapper;

}
