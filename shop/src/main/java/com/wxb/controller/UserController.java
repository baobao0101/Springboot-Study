package com.wxb.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wxb.entity.User;
import com.wxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ProjectName shop
 * @ClassName UserController
 * @Date 2020/3/4 20:55
 * @Author wangxiaobao
 * @Version 1.0
 */
//相当于@Controller+@ResponseBody,表示控制器所有方法都返回纯数据
//@RestController
@Controller
@RequestMapping("/user")
@SessionAttributes(names = "user",types = User.class)
@ResponseBody
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/login")
    public String hello(Model model, HttpSession session, String username, String password){
        LambdaQueryWrapper<User> queryWrapper= Wrappers.<User>lambdaQuery()
                .eq(User::getUsername,username).eq(User::getPassword,password);
        User user = userService.getOne(queryWrapper);
        if(user!=null){
            model.addAttribute("user",user);
            return "1";
        }
        return "0";
    }
    @GetMapping("/logout")
    public String logout(SessionStatus sessionStatus){
        //清空session
        sessionStatus.setComplete();
        return "1";
    }
}
