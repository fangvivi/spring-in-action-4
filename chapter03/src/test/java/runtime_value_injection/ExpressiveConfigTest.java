package runtime_value_injection;

import cn.wayne.runtime_value_injection.BlankDisc;
import cn.wayne.runtime_value_injection.ExpressiveConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
@Slf4j
public class ExpressiveConfigTest {

    @Autowired
    BlankDisc disc;

    @Test
    public void disc() {
        assertNotNull(disc);
        assertEquals("周杰伦",disc.getArtist());
        assertEquals("青花瓷",disc.getTitle());
    }
}