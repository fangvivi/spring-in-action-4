package xml_config;

import cn.wayne.xml_config.MP4Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试使用p命名空间元素为bean装配属性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:p-namespace-config-test.xml"})
public class XMLPNameSpaceTest {
    @Autowired
    private MP4Player mp4Player;

    @Test
    public void playTest(){
        mp4Player.play();
    }
}
