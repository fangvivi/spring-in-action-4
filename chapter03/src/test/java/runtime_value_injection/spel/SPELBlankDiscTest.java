package runtime_value_injection.spel;

import cn.wayne.runtime_value_injection.spel.SPELBlankDisc;
import cn.wayne.runtime_value_injection.spel.SPELBlankDiscConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SPELBlankDiscConfig.class)
public class SPELBlankDiscTest {
    @Autowired
    private SPELBlankDisc disc;
    @Test
    public void spelBlankDiscTest(){
        assertEquals("周杰伦",disc.getArtist());
    }
}
