package com.example.mybootapp3;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* Hello world!
*/
@RestController
public class Controller{
    @RequestMapping("/taro")
    public String index() {
        return "Taro desu!";
    }
}