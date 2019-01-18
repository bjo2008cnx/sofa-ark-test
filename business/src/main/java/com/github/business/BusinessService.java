package com.github.business;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import com.github.demo.MyServiceV1;
import com.github.demo.MyServiceV2;

public class BusinessService {
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
        System.out.println("business classloader: " + BusinessService.class.getClassLoader());
        System.out.println("v1 starts.");
        new MyServiceV1().execute();
        System.out.println("v2 starts.");
        new MyServiceV2().execute();
    }
}
