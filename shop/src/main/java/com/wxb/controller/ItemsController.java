package com.wxb.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wxb.entity.Carts;
import com.wxb.entity.Category;
import com.wxb.entity.ItemStatus;
import com.wxb.entity.Items;
import com.wxb.service.CateService;
import com.wxb.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName shop
 * @ClassName ItemsController
 * @Date 2020/3/5 22:57
 * @Author wangxiaobao
 * @Version 1.0
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    CateService cateService;
    @Autowired
    ItemsService itemsService;
    @RequestMapping("/list")
    public String itemslist(Model model){
        //查询商品
        Page<Items> page = itemsService.page(new Page<>(1,5));
        List<Items> records = page.getRecords();
        //List<String> types=new ArrayList<>();
        List<Carts> cartsList=new ArrayList<>();
        for (Items items:records){
            Carts carts=new Carts();
            QueryWrapper<Category> queryWrapper=new QueryWrapper<>();
            queryWrapper.select("name");
            long id=items.getId();
            String type = cateService.getById(items.getCateId()).getName();
            String name=items.getName();
            String pic=items.getPic();
            double price=items.getPrice();
            ItemStatus itemStatus=items.getStatus();
            Date createDate=items.getCreateDate();
            long cateId=items.getCateId();
            carts.setCateId(cateId);
            carts.setId(id);
            carts.setStatus(itemStatus);
            carts.setName(name);
            carts.setCreateDate(createDate);
            carts.setPic(pic);
            carts.setPrice(price);
            carts.setType(type);
            cartsList.add(carts);
//            types.add(type);
//            System.out.println(types);
//            model.addAttribute("types",types);
        }
        System.out.println(cartsList);
        //查询商品类型
        List<Category> categories= cateService.list();
        model.addAttribute("categories",categories);
        model.addAttribute("page",page);
        model.addAttribute("cartsList",cartsList);
        return "items";
    }
}
