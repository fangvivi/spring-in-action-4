package cn.wayne.runtime_value_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author wayne
 * app.properties 这个属性文件会加载到Spring的Environment中，稍后从中检索属性
 * 不加encoding属性，读取中文有乱码
 */
@Configuration
@PropertySource(value = "classpath:app.properties",encoding = "UTF-8")
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
}
