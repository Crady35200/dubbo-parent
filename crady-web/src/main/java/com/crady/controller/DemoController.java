package com.crady.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.crady.demo.DemoService;
import com.crady.demo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:Crady
 * @date:2018/6/12 10:51
 * @desc:
 **/
@Controller
@RequestMapping("demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Reference
    DemoService demoService;

    @RequestMapping("demo")
    @ResponseBody
    public Object hi(){

        logger.info("controller invoked***************************************************************");
        User result = demoService.say(null);
        logger.info("controller invoked.....{}",result);
        return result;
    }
}
