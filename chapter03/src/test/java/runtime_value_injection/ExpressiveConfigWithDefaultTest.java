package runtime_value_injection;

import cn.wayne.runtime_value_injection.BlankDisc;
import cn.wayne.runtime_value_injection.ExpressiveConfigWithDefault;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfigWithDefault.class)
public class ExpressiveConfigWithDefaultTest {
    @Autowired
    BlankDisc blankDisc;

    /**
     * 属性文件中没有default_title和default_artist属性，
     * 所以BlankDisc这个bean的属性被注入了默认值值
     */
    @Test
    public void getSong() {
        assertNotNull(blankDisc);
        assertEquals("林俊杰",blankDisc.getArtist());
        assertEquals("醉赤壁",blankDisc.getTitle());
    }
}