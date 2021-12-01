package xml_config;

import cn.wayne.xml_config.AppleMP4Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:*.xml"})
public class MP4PlayerTest {

    @Autowired
    private AppleMP4Player appleMP4Player;
    @Test
    public void Mp4PlayerTest(){

        assertNotNull(appleMP4Player);
    }

}
