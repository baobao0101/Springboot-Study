package com.wxb.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxb.entity.Category;
import com.wxb.mapper.CateMapper;
import org.springframework.stereotype.Service;

/**
 * @ProjectName shop
 * @ClassName CateServiceImpl
 * @Date 2020/3/6 13:25
 * @Author wangxiaobao
 * @Version 1.0
 */
@Service
public class CateServiceImpl extends ServiceImpl<CateMapper,Category> implements CateService {

}
