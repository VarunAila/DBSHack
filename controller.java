package com.telusko.springmvcboot;

 

import javax.servlet.http.HttpSession;

 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }
    @RequestMapping("add")
    public String add(@RequestParam("num1") String i,@RequestParam("num2") String j) {

 

        return "result.jsp";
    }
    @RequestMapping("services")
    public String service() {
        return "index.jsp";
    }
     
   
}
