package com.crady.demo;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author:Crady
 * @date:2018/6/8 15:50
 * @desc:
 **/
@Service
public class DemoServiceImpl implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
    public User say(String words){
        String s = "--------------------------------------------------------------you say : " + words;
        logger.info(s);
        User user = new User();
        user.setId(88l);
        user.setName("crady");
        user.setAge(29);
        user.setBirthDay(new Date());
        user.setDesc(words);
        return user;
    }
}
