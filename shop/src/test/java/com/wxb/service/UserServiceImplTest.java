package com.wxb.service;

import com.wxb.ShopApplicationTests;
import org.junit.Test;

import java.util.Arrays;


/**
 * @ProjectName shop
 * @ClassName UserServiceImplTest
 * @Date 2020/3/4 23:05
 * @Author wangxiaobao
 * @Version 1.0
 */
public class UserServiceImplTest extends ShopApplicationTests{
    @Test
    public void testListByIds(){
        userService.listByIds(Arrays.asList(1,2)).forEach(System.out::println);
    }

}