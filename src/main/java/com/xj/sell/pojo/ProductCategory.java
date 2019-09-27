package com.xj.sell.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 类目
 * Created by xj
 * 2019-09-26 22:18
 * 自动对应product_category
 **/
@Entity  //数据库映射成对象需要的注解
@DynamicUpdate //可以在修改的时候，在save方法中把updateTime自动更新
@Data //lombok插件的注解，可以帮助省去写get、set、toString方法的麻烦
public class ProductCategory {

    /** 类目id */
    @Id     //主键
    @GeneratedValue    //自增字段
    private Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}
