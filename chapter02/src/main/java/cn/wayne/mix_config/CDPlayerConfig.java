package cn.wayne.mix_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wayne
 * Import注解可以把其他的配置类导入，这样和定义在一个配置类中的效果是一样的
 * 这里可以同时导入多个配置类
 */
@Import(CDconfig.class)
@Configuration
public class CDPlayerConfig {

    @Bean(name="walkMan")
    public MediaPlayer songPlayer(CompactDisc zuiChiBi){
        return new WalkManPlayer(zuiChiBi);
    }
}
