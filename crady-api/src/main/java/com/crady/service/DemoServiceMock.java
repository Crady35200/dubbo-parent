package com.crady.service;

/**
 * @author:Crady
 * @date:2018/6/8 15:50
 * @desc:
 **/
public class DemoServiceMock implements DemoService {
    public User say(String words){
        String s = "--------------------------------------------------------------服务降级 : " + words;
        System.out.println(s);
        return new User();
    }
}
