package cn.wayne.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 */
@Configuration
public class MP3PlayerConfig {

    /**
     * 默认情况下，Spring中的bean都是单例的
     *  Bean 注解会告诉Spring这个方法将会返回一个对象，
     *  这个对象要注册为Spring应用上下文的bean
     * 默认情况下，bean的id为方法名
     */
    @Bean(name = "song")
    public SongRecord goodSongRecord(){
        return new GoodSongRecord();
    }

    /**
     * 因为cdPlayer()添加了@Bean注解，所以Spring会拦截所有对它的调用，
     * 确保直接返回的时候这个方法创建的bean，而不是对这个方法的调用
     */
    @Bean
    public MP3Player cdPlayer(){
        return new SonyMP3Player(goodSongRecord());
    }

    /**
     * 这种方法和返回相同的bean类型
     * 当Spring调用 getPlayer(SongRecord cd) 创建bean的时候，
     * 它会自动装配一个SongRecord到配置方法中
     */
    @Bean
    public MP3Player getPlayer(SongRecord cd){

        return new SonyMP3Player(cd);

        // CDPlayer cdPlayer =new CDPlayer(cd);
        // cdPlayer.setCd(cd);
        // return cdPlayer;
    }
}
