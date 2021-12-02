package cn.wayne.mix_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 *
 */
@Configuration
public class CDconfig {

    @Bean
    public CompactDisc compactDisc(){
        return new ACG();
    }
}
