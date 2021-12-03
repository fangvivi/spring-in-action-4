package xml_config;

import cn.wayne.xml_config.Ipod;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * 测试基于xml的显示配置为构造器注入字面量和引用
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config-test.xml"})
public class XMLAutoWiredTest {

    @Autowired
    private Ipod ipod;
    @Test
    public void IpodTest(){
        assertNotNull(ipod);
        ipod.play();
    }

}
