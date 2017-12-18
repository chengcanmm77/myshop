package com.bucket.shop.web.controller.goods;

import com.bucket.shop.common.vo.item.category.CategoryVo;
import com.bucket.shop.service.goods.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuguantou
 * @date 2017/5/4 0004
 */
@Controller("/goods/category/")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @RequestMapping("/create")
    @ResponseBody
    public CategoryVo create(CategoryVo vo){
        return categoryService.createCategory(vo);
    }

    @RequestMapping("/update")
    public CategoryVo update(CategoryVo vo){
        return categoryService.udpate(vo);
    }

    @RequestMapping("/queryById")
    public CategoryVo queryById(Long id){
        return categoryService.queryById(id);
    }

    @RequestMapping("/queryAll")
    public List<CategoryVo> queryAll(){
        return categoryService.queryList(null);
    }

    @RequestMapping("/deleteById")
    public void deleteById(Long id,boolean deleteAll){
        categoryService.deleteById(id);
    }

}
