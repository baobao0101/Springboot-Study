package com.wxb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wxb.ShopApplicationTests;
import com.wxb.entity.ItemStatus;
import com.wxb.entity.Items;
import com.wxb.mapper.ItemsMapper;
import org.jboss.arquillian.test.spi.TestResult;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @ProjectName shop
 * @ClassName ItemsServiceImplTest
 * @Date 2020/3/6 12:38
 * @Author wangxiaobao
 * @Version 1.0
 */
public class ItemsServiceImplTest extends ShopApplicationTests{
    @Test
    public void testInsert(){
        Items items=new Items();
        items.setName("充电器");
        items.setPic("timg.jpg");
        items.setPrice(2000d);
        items.setStatus(ItemStatus.UP);
        items.setCreateDate(new Date());
        itemsMapper.insert(items);
    }
    @Test
    public void testList(){
        QueryWrapper<Items> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("id","name");
        itemsMapper.selectList(queryWrapper).forEach(System.out::println);
    }
}