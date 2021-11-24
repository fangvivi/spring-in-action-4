package cn.wayne;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.*;
@RunWith(SpringJUnit4ClassRunner.class)
class BraveKnightTest {

    @Test
    void embarkOnQuest() {
        Quest mock = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mock);
        braveKnight.embarkOnQuest();
        verify(mock,times(1)).embark();
    }
}