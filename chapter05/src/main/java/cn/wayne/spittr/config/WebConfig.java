package cn.wayne.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author wayne
 * 注解@EnableWebMvc可以启用Spring MVC，作用等同于在xml中指定<mvc:annotation-driven />
 * 这个类什么方法也没有，也可以启用Spring MVC，会存在一些问题
 * 1、没有配置视图解析器，Spring会默认使用BeanNameViewResolver。这个视图解析器会查找ID与视图名称匹配的Bean,
 * 并且查找的bean要实现View接口
 * 2、没有启用组件扫描，这样Spring只能找到显示声明在配置类中的控制器
 * 3、DispatcherServlet会映射为应用的默认Servlet，会处理所有的请求，包括静态资源（图片和样式）
 */
@Configuration
@EnableWebMvc
@ComponentScan("cn.wayne.spittr")
public class WebConfig implements WebMvcConfigurer {

    /**
     * @return
     * 配置JSP视图解析器
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver
                = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    /**
     * @param configurer
     * 配置静态资源的处理，要求DispatcherServlet把静态资源的请求转发到Servlet容器默认的Servlet上
     */
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
