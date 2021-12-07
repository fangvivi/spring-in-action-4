package cn.wayne.primary_qualifier;

import cn.wayne.primary_qualifier.annotation.Cold;
import cn.wayne.primary_qualifier.annotation.Creamy;
import cn.wayne.primary_qualifier.annotation.Fruity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author wayne
 * 假设自动装配的时候，有多个满足要求的bean，在一个创建bean的方法或者类上使用@Primary可以消除歧义
 * @Primary 来标识首选的bean
 */
@Configuration
public class DessertConfig {
    @Bean
    public Dessert cake(){
        return new Cake();
    }

    @Bean
    @Primary
    public Dessert cookies(){
        return new Cookies();
    }

    /**
     * @return
     * 为了防止重构代码，导致iceCream的默认限定名发生改变，
     * 这里可以使用@Qualifier注解给bean指定限定名
     */
    @Bean
    @Primary
    @Creamy
    @Cold
    public Dessert iceCream(){
        return new IceCream();
    }

    /**
     *  @Cold 与 @Qualifier("Cold")作用相同
     * 自定义注解可以实现使用多个限定符的作用，@Qualifier只能使用一个
     */
    @Bean
    @Cold
    @Fruity
    public Dessert popsicle(){
        return new Popsicle();
    }

    @Bean
    public Boy boy(){
        return new Boy();
    }
}
