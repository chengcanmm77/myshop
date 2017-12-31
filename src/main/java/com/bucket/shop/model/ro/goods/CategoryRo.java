/**
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.bucket.shop.model.ro.goods;

import com.bucket.shop.model.ro.BaseRo;

import java.io.Serializable;
import java.util.List;

/**
 * @author yuguantou
 * @version 1.0
 * @since 2017-12-18 19:38
 */
public class CategoryRo extends BaseRo implements Serializable {

    /**
     * 类目ID,主键
     */
    private Integer           categoryId;
    /**
     * 类目名称
     */
    private String            categoryName;
    /**
     * 类目编码<br>
     * 编码规则如下：<br>
     * 节点1：AB, 节点2为节点1的子节点，那么节点2为ABAB,节点3为节点2的子节点，那么节点3为ABABAB
     */
    private String            categoryCode;
    /**
     * 类目描述
     */
    private String            categoryDesc;
    /**
     * 父节点类目编码
     */
    private String            parentCategoryCode;
    /**
     * 类目状态
     */
    private Integer           status;

    /**

     * 类目可否售卖标志, 1-可售卖; 2-不可售卖;
     */
    private Integer           saleStatus;

    /**
     * 类目父ID
     */
    private Integer           parentId;
    /**
     * 类目树形结构（把当前类目的所有上级类目用逗号分隔的方式添加进来）
     */
    private String            treePath;
    /**
     * 类目层级（当前类目是第几级类目，0是一级类目，后面依次递加）
     */
    private Integer           grade;
    /**
     * 类目排序
     */
    private Integer           categoryOrder;
    /**
     * 是否是页子节点
     */
    private Integer           isLeaf;
    /**
     * 子节点集合
     */
    private List<CategoryRo> categoryROList;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public String getParentCategoryCode() {
        return parentCategoryCode;
    }

    public void setParentCategoryCode(String parentCategoryCode) {
        this.parentCategoryCode = parentCategoryCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTreePath() {
        return treePath;
    }

    public void setTreePath(String treePath) {
        this.treePath = treePath;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Integer categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public List<CategoryRo> getCategoryROList() {
        return categoryROList;
    }

    public void setCategoryROList(List<CategoryRo> categoryROList) {
        this.categoryROList = categoryROList;
    }
}
