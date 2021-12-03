package mix_config;

import cn.wayne.mix_config.MediaPlayer;
import cn.wayne.mix_config.SoundSystemConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试SoundSystemConfig中的import注解和ImportResource注解
 * walkMan(在CDPlayerConfig中配置)指定了要注入的CompactDisc类型的bean,id必须为acg，
 * 所以虽然bean(id=zuiChiBi，class=Pop)也是CompactDisc的子类，
 * 但是最终被注入的bean是acg
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
