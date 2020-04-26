package com.wxb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName shop
 * @ClassName Category
 * @Date 2020/3/6 13:16
 * @Author wangxiaobao
 * @Version 1.0
 */
@Data
@TableName("S_CATEGORY")
public class Category implements Serializable {
    private static final long serialVersionUID = 5024120376445374256L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;

}
