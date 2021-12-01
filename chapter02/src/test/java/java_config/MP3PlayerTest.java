package java_config;

import cn.wayne.java_config.MP3Player;
import cn.wayne.java_config.MP3PlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MP3PlayerConfig.class)
public class MP3PlayerTest {

    @Autowired
    private MP3Player mp3Player;

    @Test
    public void play(){
        mp3Player.play();
    }

}
