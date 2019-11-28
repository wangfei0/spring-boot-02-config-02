/**
 * Copyright (C), 2015-2019, 王飞
 * FileName: Hello
 * Author:   WF
 * Date:     2019/8/25 9:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.springboot02config02.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author WF
 * @create 2019/8/25
 * @since 1.0.0
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring";
    }
    @RequestMapping("/exit")
    public String exit(){
        return "exit success";
    }
    @RequestMapping("/map")
    public String map(){
        return "<iframe src=\"http://www.google.cn/maps/embed?pb=!1m14!1m12!1m3!1d26515866.25428046!2d86.20774745000003!3d35.780286950000004!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1szh-CN!2scn!4v1566698447100!5m2!1szh-CN!2scn\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>";
    }

}
