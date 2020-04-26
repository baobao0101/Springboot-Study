package com.wxb.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxb.entity.Items;
import com.wxb.mapper.ItemsMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * @ProjectName shop
 * @ClassName ItemsServiceImpl
 * @Date 2020/3/6 12:07
 * @Author wangxiaobao
 * @Version 1.0
 */
@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper,Items> implements ItemsService {

}
