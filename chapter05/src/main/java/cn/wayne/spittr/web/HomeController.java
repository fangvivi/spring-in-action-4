package cn.wayne.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wayne
 * 注解@Controller把一个类声明为一个控制器
 * 注解@RequestMapping加在类上时，会应用到类中所有的处理器方法上
 * 可以接受一个String[]
 */
@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {

    /**
     * @return
     * 处理对"/"的get请求
     * value指定了请求路径
     * 处理器上的@RequestMapping，可以对类级别的上的@RequestMapping进行补充
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        // 视图名为home
        return "home";
    }
}
