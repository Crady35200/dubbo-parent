package com.crady.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:Crady
 * @date:2018/6/8 16:09
 * @desc:
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
