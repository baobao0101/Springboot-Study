package com.wxb.mapper;


import com.wxb.ShopApplicationTests;
import org.junit.Test;


/**
 * @ProjectName shop
 * @ClassName UserMapperTest
 * @Date 2020/3/4 22:21
 * @Author wangxiaobao
 * @Version 1.0
 */

public class UserMapperTest extends ShopApplicationTests{
    @Test
    public void testSelectAll(){
        userMapper.selectList(null).forEach(System.out::println);
    }

}
