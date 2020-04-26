package com.wxb.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ProjectName shop
 * @ClassName Carts
 * @Date 2020/3/8 15:01
 * @Author wangxiaobao
 * @Version 1.0
 */
@Data
public class Carts implements Serializable {
    private static final long serialVersionUID = -982289445439829767L;
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
    private String type;
}
