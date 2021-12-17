package cn.wayne;

import org.junit.Test;

public class DamselRescuingKnightTest {

    /**
     * 创建DamselRescuingKnight对象时，它的构造方法自动创建了一个RescueDamselQuest对象
     * 两个对象耦合在一起
     * 骑士只能执行一种任务
     */
    @Test
    public void embarkOnQuest() {
        DamselRescuingKnight knight = new DamselRescuingKnight();
        knight.embarkOnQuest();
    }
}