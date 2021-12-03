package xml_config;

import cn.wayne.xml_config.MP4Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试使用c命名空间的元素为bean的构造方法注入字面量
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:c-namespace-config-test.xml"})
public class XMLCNameSpaceTest {
    @Autowired
    private MP4Player mp4Player;

    @Test
    public void playTest(){
        mp4Player.play();
    }
}
