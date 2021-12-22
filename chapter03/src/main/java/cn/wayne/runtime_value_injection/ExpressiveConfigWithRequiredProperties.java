package cn.wayne.runtime_value_injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author wayne
 * app.properties 这个属性文件会加载到Spring的Environment中，稍后从中检索属性
 */
@Configuration
@PropertySource(value = "classpath:app.properties", encoding = "UTF-8")
@Slf4j
public class ExpressiveConfigWithRequiredProperties {

    private Environment env;
    @Autowired
    public ExpressiveConfigWithRequiredProperties(Environment env) {
        this.env = env;
    }

    /**
     * @return
     * 使用getRequiredProperty()获取的属性值不存在
     * 会抛出IllegalStateException 异常
     * 如果想测试ExpressiveConfigWithRequiredPropertiesTest
     * 放开@Bean的注释
     */
    // @Bean("song")
    public BlankDisc disc() {
        // 这个方法可以判断属性文件中是否存在某个属性
        boolean default_title = env.containsProperty("default_title");

        return new BlankDisc(
                env.getRequiredProperty("default_title"),
                env.getRequiredProperty("default_artist"));
    }


}
