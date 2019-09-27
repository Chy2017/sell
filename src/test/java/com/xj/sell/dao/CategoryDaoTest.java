package com.xj.sell.dao;

import com.xj.sell.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryDaoTest {

    @Autowired
    private CategoryDao dao;

    @Test
    public void findOneTest(){
        ProductCategory category = dao.findById(1).orElse(null);
        System.out.println(category.toString());
    }

    @Test
    @Transactional //回滚事务，可以让测试的数据不留在数据库中，这里是完全的回滚
    public void saveTest(){
        ProductCategory category = new ProductCategory("男孩最爱",1003);
        ProductCategory res = dao.save(category);
        Assert.assertNotNull(res);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1002,1222,1022);
        List<ProductCategory> res = dao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,res.size());
    }
}