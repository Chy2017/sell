package com.xj.sell.service;

import com.xj.sell.pojo.ProductCategory;

import java.util.List;

/**
 * 类目Service
 * Created by xj
 * 2019-09-27 10:21
 */
public interface CategoryService {

    //查找指定id的类目，后台管理用
    ProductCategory findOne(Integer categoryId);

    //查询全部类目，后台管理用
    List<ProductCategory> findAll();

    //通过type来查类目，买家端用到的
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //新增和更新
    ProductCategory save(ProductCategory category);
}