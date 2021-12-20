package cn.wayne.runtime_value_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author wayne
 * app.properties 这个属性文件会加载到Spring的Environment中，稍后从中检索属性
 */
@Configuration
@PropertySource(value = "classpath:app.properties", encoding = "UTF-8")
public class ExpressiveConfigWithDefault {

    private Environment env;
    @Autowired
    public ExpressiveConfigWithDefault(Environment env) {
        this.env = env;
    }

    /**
     * @return
     * 当指定属性不存在的时候，会使用默认值
     */
    @Bean("song")
    public BlankDisc getSong() {
        return new BlankDisc(
                env.getProperty("default_title","醉赤壁"),
                env.getProperty("default_artist","林俊杰"));
    }


}
