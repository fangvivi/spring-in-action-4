package cn.wayne.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author wayne
 * AbstractAnnotationConfigDispatcherServletInitializer
 * 会同时创建DispatcherServlet 和 ContextLoaderListener
 * DispatcherServlet 启动的时候会创建Spring应用上下文，加载配置文件或者配置类中声明的bean,
 * 这个类会加载包含Web组建的bean，如控制器、视图解析器、处理器映射
 * ContextLoaderListenerr要加载其他的bean，包含驱动应用后端的中间层和数据层组件
 */
public class SpittrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * getRootConfigClasses会返回带有@Configuration注解的类
     * 用来配置ContextLoaderListener所创建的应用上下文中的bean
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    /**
     * getServletConfigClasses会返回带有@Configuration注解的类
     * 用来定义DispatcherServlet应用上下文中的bean
     *
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * 把DispatcherServlet映射到"/"，表示它是应用默认的servlet,
     * 会处理进入应用的所有请求
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
