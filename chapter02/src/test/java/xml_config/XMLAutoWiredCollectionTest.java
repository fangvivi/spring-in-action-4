package xml_config;

import cn.wayne.xml_config.Ipod;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试使用xml方式给构造器注入集合和字面量
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:autowired-collection-config-test.xml"})
public class XMLAutoWiredCollectionTest {
    @Autowired
    private Ipod ipod;

    @Test
    public void play(){
        ipod.play();
    }
}
