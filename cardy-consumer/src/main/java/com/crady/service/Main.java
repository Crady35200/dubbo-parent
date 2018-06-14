package com.crady.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:Crady
 * @date:2018/6/8 16:32
 * @desc:
 **/
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        for (int i = 0; i < 5; i++) {

        User s = demoService.say("Hi,Crady !"); // 执行远程方法
        logger.info("^^^^^^^^^^^^^^^^^^^^" + s);
        logger.info("***************client invoked*************************************");
        }
    }
}
