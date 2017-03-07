package com.bucket.shop.dal.dao.item;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.dal.mapper.item.ItemSkuMapper;

@Repository
public class ItemSkuDao {

    @Resource
    private ItemSkuMapper itemSkuMapper;
}
