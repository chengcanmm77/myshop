package com.bucket.shop.common.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import com.bucket.shop.common.vo.item.brand.BrandVo;
import com.bucket.shop.model.dbo.goods.brand.BrandDo;

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
    
    @SuppressWarnings("rawtypes")
    public static <T> List<T> conveterList(List list, Class<T> oriClz) {
        if (CollectionUtils.isEmpty(list) || oriClz == null) {
            return null;
        }

        List<T> result = new ArrayList<>(list.size());
        for (Object pojo : list) {
            result.add(conveter(pojo, oriClz));
        }

        return result;
    }

    public static void main(String[] args) {
        BrandVo vo = new BrandVo();
        vo.setBrandCode("ddd");

        BrandDo bdo = conveter(vo, BrandDo.class);
        System.out.println(bdo.getBrandCode());
    }
}
