package cn.wayne.mix_config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

/**
 * @author wayne
 * 自动装配并不会在意bean来自于哪里，不管是在JavaConfig或是XML中声明的
 * 在一个配置类中同时导入多个配置类与
 * 在 CDPlayerConfig 中导入 CDconfig 效果是相同的
 * ImportResource注解用于在JavaConfig中引用XML配置
 */
// @Import({CDPlayerConfig.class, CDConfig.class})
@Configuration
@Import({CDPlayerConfig.class})
// @ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {
}
