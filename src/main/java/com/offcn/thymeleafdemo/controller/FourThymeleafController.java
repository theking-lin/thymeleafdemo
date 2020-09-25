package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>title:com.offcn.thymeleafdemo.controller</p>
 * <p>Description</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2020/9/25
 * version:1.0
 */
@Controller
public class FourThymeleafController {
    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index4.html
     * @param model
     * @return
     */
    @GetMapping("/four")
    public String indexPage(Model model) {
        model.addAttribute("userName", "优就业");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index4";
    }
}
