package com.bucket.shop.common.util;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import com.bucket.shop.common.vo.item.brand.BrandVo;
import com.bucket.shop.model.dbo.item.brand.BrandDo;

/**
 * 
 * @author chengcanming
 * @version $Id: ConvetorUtil.java, v 0.1 2017年3月3日 上午11:18:36 chengcanming Exp $
 */
public class ConvetorUtil {

    public static <T> T conveter(Object ob, Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
            BeanUtils.copyProperties(ob, t);
        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return t;
    }

    public static void main(String[] args) {
        BrandVo vo = new BrandVo();
        vo.setBrandCode("ddd");

        BrandDo bdo = conveter(vo, BrandDo.class);
        System.out.println(bdo.getBrandCode());
    }
}
