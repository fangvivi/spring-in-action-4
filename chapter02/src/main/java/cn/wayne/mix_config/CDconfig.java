package cn.wayne.mix_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 *
 */
@Configuration
public class CDconfig {

    /**
     * 这样创建的bean，默认情况下bean的id是方法名，这里手动指定id为acg
     */
    @Bean(name = "acg")
    public CompactDisc compactDisc(){
        return new ACG();
    }

}
