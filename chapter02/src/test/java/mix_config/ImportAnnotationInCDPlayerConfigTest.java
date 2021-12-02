package mix_config;

import cn.wayne.mix_config.CDPlayerConfig;
import cn.wayne.mix_config.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {CDPlayerConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ImportAnnotationInCDPlayerConfigTest {
    @Autowired
    private MediaPlayer player;

    @Test
    public void playTest(){
        player.play();
    }
}
