package com.sam.uvb76.book.mybatis;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-10-21 22:11:08
 */
public class User implements Serializable {
    private static final long serialVersionUID = -65053173154309433L;
    
    private Integer id;
    
    private String name;
    
    private String provinceId;


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

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

}