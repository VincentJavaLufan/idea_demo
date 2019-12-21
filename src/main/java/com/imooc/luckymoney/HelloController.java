package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${description}")
//    private String description;

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")//旧新版本的方法  http://localhost:8081/luckymoney/hello
//    @RequestMapping(value="hello",method= RequestMethod.GET)//旧版本的方法
    public String say(){
        return "说明：" + limitConfig.getDescription();
    }
}
