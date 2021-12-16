package cn.wayne.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author wayne
 * 这里排除了使用@EnableWebMvc的类
 */
@Configuration
@ComponentScan(basePackages = {"cn.wayne.spittr"},
excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION, value = EnableWebMvc.class)
})
public class RootConfig {
}
