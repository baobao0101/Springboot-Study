package com.wxb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ProjectName shop
 * @ClassName Items
 * @Date 2020/3/6 10:07
 * @Author wangxiaobao
 * @Version 1.0
 */
@Data
@TableName("S_ITEMS")
public class Items implements Serializable{
    private static final long serialVersionUID = -3657062888127933666L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String pic;
    private String name;
    private Double price;
    private ItemStatus status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
//    表示该属性不映射数据库列
//    @TableField(exist = false)
//    private Category category;
    private Long cateId;
}
