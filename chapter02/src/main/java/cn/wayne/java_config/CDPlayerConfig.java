package cn.wayne.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 */
@Configuration
public class CDPlayerConfig {

    /**
     * 默认情况下，Spring中的bean都是单例的
     *  Bean 注解会告诉Spring这个方法将会返回一个对象，
     *  这个对象要注册为Spring应用上下文的bean
     *
     *  默认情况下，bean的id为方法名
     */
    @Bean(name = "aGoodCD")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    /**
     * 因为sgtPeppers()添加了@Bean注解，所以Spring会拦截所有对它的调用，
     * 确保直接返回的时候这个方法创建的bean，而不是对这个方法的调用
     */
    @Bean
    public MediaPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    /**
     * 这种方法和上面类似
     * 当Spring调用 cdPlayer(CompactDisc compactDisc) 创建bean的时候，
     * 它会自动装配一个CompactDisc到配置方法中
     */
    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);

        // CDPlayer cdPlayer =new CDPlayer(compactDisc);
        // cdPlayer.setCd(compactDisc);
        // return cdPlayer;
    }
}
