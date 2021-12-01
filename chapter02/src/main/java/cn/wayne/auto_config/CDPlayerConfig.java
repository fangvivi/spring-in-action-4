package cn.wayne.auto_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 * ComponentScan 启用组件扫描
 * 没有其他配置，默认扫描同包类和所有的子包
 * basePackageClasses指定的类所在的包会作为组件扫描的基础包
 */

// @ComponentScan(basePackages = "cn.wayne.auto_config")
// @ComponentScan(basePackageClasses = {GoodSongRecord.class})

@Configuration
@ComponentScan("cn.wayne.auto_config")
public class CDPlayerConfig {
}
