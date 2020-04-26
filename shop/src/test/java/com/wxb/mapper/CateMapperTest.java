package com.wxb.mapper;

import com.wxb.ShopApplicationTests;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @ProjectName shop
 * @ClassName CateMapperTest
 * @Date 2020/3/6 13:19
 * @Author wangxiaobao
 * @Version 1.0
 */
public class CateMapperTest extends ShopApplicationTests{
    @Test
    public void testList(){
        cateMapper.selectList(null).forEach(System.out::println);
    }
}