package com.wxb.controller;

import com.wxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @ProjectName shop
 * @ClassName HomeController
 * @Date 2020/3/5 23:21
 * @Author wangxiaobao
 * @Version 1.0
 */
@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @RequestMapping("/welcome")
    public String home(Model model){
        int count = userService.count();
        model.addAttribute("count",count);
        model.addAttribute("time",new Date());
        return "welcome";
    }

}
