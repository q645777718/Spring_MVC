package Spring_MVC.controller;

import Spring_MVC.annotation.ExtController;
import Spring_MVC.annotation.ExtRequestMapping;

/**
 * @author shkstart
 * @create 2020-05-14 17:55
 */


@ExtController
@ExtRequestMapping("/ext")
public class ExtIndexController {

    @ExtRequestMapping("/test")
    public String test(String name,Integer age){
        System.out.println("手写springmvc框架...");
        return "index";
    }
}
