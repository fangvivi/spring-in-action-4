package cn.wayne.mix_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wayne
 * Import注解可以把其他的配置导入，这样和定义在一个配置类中的效果是一样的
 */
@Import(CDconfig.class)
@Configuration
public class CDPlayerConfig {

    @Bean
    public MediaPlayer songPlayer(CompactDisc cd){
        return new WalkManPlayer(cd);
    }
}
