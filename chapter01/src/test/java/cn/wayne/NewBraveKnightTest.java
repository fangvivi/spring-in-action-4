package cn.wayne;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class NewBraveKnightTest {


    @Test
    public void testAop(){
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:minstrel.xml");
        NewBraveKnight knight = context.getBean("knight2", NewBraveKnight.class);
        knight.embarkOnQuest();
        context.close();
    }
}