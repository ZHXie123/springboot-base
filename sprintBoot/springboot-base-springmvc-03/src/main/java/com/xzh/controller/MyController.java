package com.xzh.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {


    @RequestMapping("nima")
    public String getUserFromYaml(){
        return "register.html";
    }
}
