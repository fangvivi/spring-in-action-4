package mix_config;

import cn.wayne.mix_config.CompactDisc;
import cn.wayne.mix_config.Pop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:cd-config-test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SameTypeBeanTest {

    /**
     * 测试同类型的bean是否是同一个对象
     */
    @Test
    public void testSameBeanWhetherEqual(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:cd-config-test.xml");
        CompactDisc qingHuaCi = context.getBean("QingHuaCi", Pop.class);
        CompactDisc qhc = context.getBean("QHC", Pop.class);
        // 输出false，证明同一个xml中的一个类，配置成多个id不同的bean，
        // 实际从spring容器中取到的bean对象地址是不同的
        System.out.println(qingHuaCi==qhc);


    }
}
