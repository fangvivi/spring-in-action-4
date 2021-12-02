package mix_config;

import cn.wayne.mix_config.MediaPlayer;
import cn.wayne.mix_config.SoundSystemConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试SoundSystemConfig中的import注解
 *
 */
@ContextConfiguration(classes = {SoundSystemConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ImportAnnotationInSoundSystemConfigTest {
    @Autowired
    private MediaPlayer player;

    @Test
    public void playTest(){
        player.play();
    }
}
