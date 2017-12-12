package com.bucket.shop.model.dbo.goods.category;

import com.bucket.shop.model.dbo.BaseDo;

/**
 * 类型管理DO
 */
public class CategoryDo extends BaseDo {

    /**
     * 类目ID,主键
     */
    private Integer categoryId;
    /**
     * 类目名称
     */
    private String  categoryName;
    /**
     * 类目编码
     */
    private String  categoryCode;
    /**
     * 类目描述
     */
    private String  categoryDesc;
    /**
     * 类目状态
     */
    private Integer status;

    /**
     * 类目可否售卖标志, 1-可售卖; 2-不可售卖;
     */
    private Integer saleStatus;

    /**
     * 类目父ID
     */
    private Integer parentId;
    /**
     * 类目树形结构（把当前类目的所有上级类目用逗号分隔的方式添加进来）
     */
    private String  treePath;
    /**
     * 类目层级（当前类目是第几级类目，0是一级类目，后面依次递加）
     */
    private Integer grade;
    /**
     * 类目排序
     */
    private Integer categoryOrder;
    /**
     * 是否是页子节点,0 不是叶子节点 1 是叶子节点
     */
    private Integer isLeaf;

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

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

    /**
     * Getter method for property <tt>categoryDesc</tt>.
     * 
     * @return property value of categoryDesc
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * Setter method for property <tt>categoryDesc</tt>.
     * 
     * @param categoryDesc value to be assigned to property categoryDesc
     */
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

}
