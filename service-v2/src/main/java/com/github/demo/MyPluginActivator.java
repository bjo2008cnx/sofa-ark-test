package com.github.demo;


import com.alipay.sofa.ark.exception.ArkException;
import com.alipay.sofa.ark.spi.model.PluginContext;
import com.alipay.sofa.ark.spi.service.PluginActivator;

/**
 * A sample ark-plugin activator
 *
 * @author qilong.zql
 * @since 0.1.0
 */
public class MyPluginActivator implements PluginActivator{

    public void start(PluginContext context) throws ArkException {
        System.out.println("starting in sample ark plugin activator");
        context.publishService(MyServiceV2.class, new MyServiceV2());
    }

    public void stop(PluginContext context) throws ArkException {
        System.out.println("stopping in ark plugin activator");
    }

}