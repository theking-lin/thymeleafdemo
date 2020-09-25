package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>title:com.offcn.thymeleafdemo.controller</p>
 * <p>Description</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2020/9/25
 * version:1.0
 */
@Controller
public class FirstThymeleafController {

    @GetMapping("/first")
    public String indexPage(Model model){
        String message="hello thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }
}
