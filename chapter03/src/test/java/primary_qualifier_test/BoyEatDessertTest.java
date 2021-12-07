package primary_qualifier_test;

import cn.wayne.primary_qualifier.Boy;
import cn.wayne.primary_qualifier.DessertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试@primary和@Qualifier消除自动装配歧义
 */
@ContextConfiguration(classes = DessertConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BoyEatDessertTest {
    @Autowired
    private Boy boy;
    @Test
    public void boyEatDessertTest(){
        boy.eat();
    }
}
