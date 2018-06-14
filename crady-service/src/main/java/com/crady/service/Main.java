package com.crady.service;

/**
 * @author:Crady
 * @date:2018/6/8 16:09
 * @desc:
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        com.alibaba.dubbo.container.Main.main(args);
/*        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出*/
    }
}
