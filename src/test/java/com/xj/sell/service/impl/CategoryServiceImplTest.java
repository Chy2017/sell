package com.xj.sell.service.impl;

import com.xj.sell.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @Test
    public void findOne(){
        ProductCategory productCategory = categoryServiceImpl.findOne(2);
        Assert.assertEquals(new Integer(2), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryServiceImpl.findAll();
        Assert.assertEquals(new Integer(1001),productCategoryList.get(0).getCategoryType());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1002,1222,1022);
        List<ProductCategory> res = categoryServiceImpl.findByCategoryTypeIn(list);
        Assert.assertEquals(2, res.size());
    }

    @Test
    public void save() {
        ProductCategory category = new ProductCategory("狗狗最爱",1521);
        ProductCategory res = categoryServiceImpl.save(category);
        Assert.assertNotNull(res);
    }
}