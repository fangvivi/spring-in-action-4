package cn.wayne.auto_config;

import org.springframework.stereotype.Component;

/**
 * @author wayne
 * Component 注解表明这是一个组件类，并告知Spring要为这个类创建bean
 * 不过组件扫描默认时不开启的
 * 默认把类名小写，作为bean的名字
 * 也可以在括号里面指定
 */

// @Component
@Component("yiYongJunJinXingQu")
public class SgtPeppers implements CompactDisc{

    private String title = "义勇军进行曲";
    private String artist = "聂耳";

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
    }
}
