package com.bucket.shop.web.controller.goods;

import com.bucket.shop.model.ro.goods.ItemRo;
import com.bucket.shop.service.goods.item.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods/item")
public class ItemController {

    @Resource
    private ItemService itemService;

    @RequestMapping("create")
    public ItemRo create(ItemRo ro){
        return null;
    }

    public ItemRo queryById(Long id){
        return null;
    }

    public Boolean deleteById(Long id){

        return null;
    }

}
