package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsCreateController {

    @Autowired
    PostService postService;


    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    @PostMapping("/new")
    public String doCreate(@ModelAttribute("text") String text) {
        postService.create(text);
        return "redirect:/";
    }
}
