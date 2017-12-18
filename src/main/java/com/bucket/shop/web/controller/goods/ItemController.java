package com.bucket.shop.web.controller.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bucket.shop.common.so.item.ItemSo;
import com.bucket.shop.common.vo.item.ItemVo;

@Controller
@RequestMapping("/item")
public class ItemController {

    @RequestMapping("/getItemById")
    public String getItemById(Long id) {

        return "item_detail";
    }

    @RequestMapping("/queryItemList")
    public String queryItemList(ItemSo itemSo) {
        return "item_list";
    }

    @RequestMapping("/createItem")
    public String createItem(ItemVo itemVo) {
        return "";
    }

    @RequestMapping("/updateItem")
    public String updateItem(ItemVo itemVo) {
        return "";
    }

    @RequestMapping("/deleteById")
    public String deleteById(Long id) {
        return "";
    }

    @RequestMapping("/delete")
    public String delete(ItemSo itemSo) {
        return "";
    }
}
