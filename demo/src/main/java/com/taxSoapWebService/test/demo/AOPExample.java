package com.taxSoapWebService.test.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by mshaik on 7/17/17.
 */
@Aspect
@Component
public class AOPExample {

    public AOPExample(){
       System.out.print("This is first time into AOP");
    }

    @Before("execution (* com.taxSoapWebService.test.demo.TestController.getthis())")
    public void beforeMethod(){
        System.out.print("Hiiiiiiiiii Before Method");
    }

    @After("execution (* com.taxSoapWebService.test.demo.TestController.getthis())")
    public void afterMethod(){
        System.out.print("Byeeeeeeeeeee  After Method");
    }

}
