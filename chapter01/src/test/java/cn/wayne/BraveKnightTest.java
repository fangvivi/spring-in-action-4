package cn.wayne;

import cn.wayne.config.KnightConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.*;

public class BraveKnightTest {

    /**
     * 手动注入
     */
    @Test
    public void embarkOnQuest() {
        Quest mock = mock(Quest.class);
        Minstrel minstrel = mock(Minstrel.class);
        BraveKnight knight = new BraveKnight(mock,minstrel);
        knight.embarkOnQuest();
        verify(mock, times(1)).embark();
    }

    /**
     * 使用xml的方式实现ioc
     */
    @Test
    public void testXMLAutowired(){
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

    /**
     * 使用注解的方式实现ioc，
     * 下面两种写法的作用是相同的
     */
    @Test
    public void testAnnotationAutowired(){
        /*
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.register(KnightConfig.class);
        context.refresh();
        */
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}