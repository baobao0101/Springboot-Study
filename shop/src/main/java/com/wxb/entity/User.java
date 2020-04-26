package com.wxb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName shop
 * @ClassName User
 * @Date 2020/3/4 21:22
 * @Author wangxiaobao
 * @Version 1.0
 */
@Data
@TableName("user_list")
public class User implements Serializable{

    private static final long serialVersionUID = 7423485922198822368L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String username;
    private String password;
}
