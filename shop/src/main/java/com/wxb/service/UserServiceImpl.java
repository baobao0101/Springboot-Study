package com.wxb.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxb.entity.User;
import com.wxb.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @ProjectName shop
 * @ClassName UserServiceImpl
 * @Date 2020/3/4 23:01
 * @Author wangxiaobao
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

}
