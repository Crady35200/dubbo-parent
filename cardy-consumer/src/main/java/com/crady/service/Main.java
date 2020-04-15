package com.crady.service;

import com.crady.exception.MyException;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        for (int i = 0; i < 5; i++) {

//            User s = demoService.say("Hi,Crady !"); // 执行远程方法
//            logger.info("^^^^^^^^^^^^^^^^^^^^" + s);
            logger.info("***************client invoked*************************************");
        }
        /**
         * dubbo中自定义异常问题：
         * 如果自定义异常在以下5种情况以内则抛出原始异常：
         * 1、是checked异常。
         * 2、异常在方法签名上有声明。
         * 3、异常和服务接口在同一个jar下。
         * 4、异常是JDK中的异常。
         * 5、异常是Dubbo中的异常。
         * 如果不在以上5种情况内，则会把原始异常包装成RuntimeException然后返回调用方。
         */
        try {
          demoService.testException("nice to meet you");
        }catch (MyException e){
            System.out.println("*******异常********");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("*******捕获不到MyException*************");
            e.printStackTrace();
        }
    }
}
