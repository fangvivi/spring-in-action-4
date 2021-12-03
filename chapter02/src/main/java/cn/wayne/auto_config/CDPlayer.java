package cn.wayne.auto_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * Autowired 注解可以在spring应用上下文中寻找某个满足需求的其他bean
 * 这个注解可以用在类的任何方法上，构造器、set方法、自定义的为属性的赋值的方法
 */
@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc cd;


    /**
     * required = false，当spring自动装配找不到合适的类时，不会抛出异常
     * 但是这个类可能会因为未装配而出现空指针异常
     * @param cd
     */
    @Autowired(required = false)
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
