package mix_config;

import cn.wayne.mix_config.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试使用一个root-config.xml来管理其他的xml配置文件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:root-config-test.xml"})
public class RootConfigXMLTest {
    @Autowired
    private MediaPlayer player;

    @Test
    public void play(){
        player.play();
    }
}
