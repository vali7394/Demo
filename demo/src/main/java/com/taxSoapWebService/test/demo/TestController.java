package com.taxSoapWebService.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mshaik on 7/17/17.
 */
@RestController
@DependsOn({"AOPExample"})
@RequestMapping("/welcome")
public class TestController {


    @Autowired
    public TestController(AOPExample aopExample){
        aopExample.beforeMethod();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getthis(){
        return "Byeeeee";
    }
}
