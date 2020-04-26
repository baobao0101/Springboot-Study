package com.wxb.entity;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @ProjectName shop
 * @ClassName ItemStatus
 * @Date 2020/3/6 11:42
 * @Author wangxiaobao
 * @Version 1.0
 */
//商品状态枚举
@Getter
public enum ItemStatus {
    UP(0,"上架"),DOWN(1,"下架");
    ItemStatus(int code,String desc){
        this.code=code;
        this.desc=desc;
    }
    @EnumValue
    private final int code;
    private final String desc;
}
