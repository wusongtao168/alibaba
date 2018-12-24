package cn.flash.express.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author:Wusongtao
 * @Date:2018/12/20下午8:50
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "This is a text!";
    }
}
