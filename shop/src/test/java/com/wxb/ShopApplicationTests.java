package com.wxb;

import com.wxb.mapper.CateMapper;
import com.wxb.mapper.ItemsMapper;
import com.wxb.mapper.UserMapper;
import com.wxb.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//springboot测试
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopApplicationTests {

	@Autowired
	public UserMapper userMapper;

	@Autowired
	public UserService userService;

	@Autowired
	public ItemsMapper itemsMapper;

	@Autowired
	public CateMapper cateMapper;

}
