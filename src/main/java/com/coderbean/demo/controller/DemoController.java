package com.coderbean.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gavin Lee
 * @version 1.0
 * @date 2021-02-22 19:36
 * @desc
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/")
    public String index(){
        return "hello world！";
    }
}
