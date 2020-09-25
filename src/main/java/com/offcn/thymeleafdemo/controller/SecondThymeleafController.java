package com.offcn.thymeleafdemo.controller;

import com.offcn.thymeleafdemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>title:com.offcn.thymeleafdemo.controller</p>
 * <p>Description</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2020/9/25
 * version:1.0
 */
@Controller
public class SecondThymeleafController {
    @GetMapping("/second")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        User u = new User();
        u.setId(1);
        u.setName("优就业");
        u.setAge(18);

        Map<String,Object> map=new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);
        return "index2";
    }
}
