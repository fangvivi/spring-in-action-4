package cn.wayne.runtime_value_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author wayne
 * app.properties 这个属性文件会加载到Spring的Environment中，稍后从中检索属性
 * 不加encoding属性，读取中文有乱码
 */
@Configuration
@ComponentScan
@PropertySource(value = {"classpath:app.properties","classpath:student.properties"} ,
        encoding = "UTF-8")
public class ExpressiveConfig {

    private Environment env;
    @Autowired
    public ExpressiveConfig(Environment env) {
        this.env = env;
    }

    @Bean("qhc")
    public BlankDisc disc() {
        return new BlankDisc(
                env.getProperty("disc.title"),
        env.getProperty("disc.artist"));
    }


    /**
     * spring提供了一个默认内置的属性解析器，这个解析器不太严格，如果找不到对应的属性，会把属性的名字注入，
     * 例如把"${name}"注入给Student的name属性
     * 如果想严格控制这种情况，应该主动声明一个属性解析器，这样找不到属性就会初始化失败。
     * 且如果这个Bean使用@Bean注解配置，相应的方法必须是静态的
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
