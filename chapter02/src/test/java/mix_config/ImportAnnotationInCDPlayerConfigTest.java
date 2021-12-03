package mix_config;

import cn.wayne.mix_config.CDPlayerConfig;
import cn.wayne.mix_config.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试SoundSystemConfig中的import注解
 * walkMan(配置在CDPlayerConfig中)虽然要求被注入的bean的id=zuiChiBi，
 * 可是在此测试案例中，spring容器中没有id=zuiChiBi的bean，只有一个同类型的bean(id=acg),
 * 依旧可以注入成功，由此可见spring会优先按照id匹配，如果找不到就按照类型匹配
 */
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
