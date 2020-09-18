package com.zzy.blog.pojo;

import java.util.Date;

/**
 * 分类实体
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
public class Category {
    private Integer id;

    private String  name;

    private Integer sort;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", createTime=" + createTime +
                '}';
    }
}
