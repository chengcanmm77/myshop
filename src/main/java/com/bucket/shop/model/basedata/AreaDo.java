package com.bucket.shop.model.basedata;

import com.bucket.shop.model.BaseDo;

/**
 * 地区信息
 * @author bucket
 */
public class AreaDo extends BaseDo {

    /**
     * id
     */
    private Long    id;

    /**
     * 名称
     */
    private String  name;

    /**
     * 编码
     */
    private String  code;

    /**
     * 上级
     */
    private Long    parentId;

    /**
     * 拼英
     */
    private String  spelling;

    /**
     * 首字母
     */
    private String  initial;

    /**
     * 状态
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getSpelling() {
        return spelling;
    }

    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
