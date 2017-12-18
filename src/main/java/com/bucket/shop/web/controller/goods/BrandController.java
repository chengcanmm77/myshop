package com.bucket.shop.web.controller.goods;

import com.bucket.shop.common.vo.item.brand.BrandVo;
import com.bucket.shop.service.goods.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuguantou
 * @date 2017/5/4 0004
 */
@Controller("/goods/brand")
public class BrandController {

    @Resource
    private BrandService brandService;

    @RequestMapping("/create")
    @ResponseBody
    public BrandVo create(BrandVo vo){
        return brandService.createBrand(vo);
    }

    @RequestMapping("/update")
    @ResponseBody
    public BrandVo update(BrandVo vo){
        return brandService.updateBrand(vo);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public void deleteById(Long id){
        brandService.deleteBrandById(id);
    }

    @RequestMapping("/queryById")
    @ResponseBody
    public BrandVo queryById(Long id){
        return brandService.queryBrandById(id);
    }

    @RequestMapping("/queryList")
    @ResponseBody
    public List<BrandVo> queryList(){
        return brandService.queryBrandList(null);
    }
}
