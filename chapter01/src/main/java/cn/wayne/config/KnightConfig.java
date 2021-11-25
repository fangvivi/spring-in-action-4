package cn.wayne.config;

import cn.wayne.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 */
@Configuration
public class KnightConfig {

    /**
     *  使用@Bean注解来声明对象，默认情况下对象的名称和方法名称是一样的
     */
    @Bean
    public Knight knight(){
        return new BraveKnight(quest(),minstrel());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel(){
        return new Minstrel(System.out);
    }

}
