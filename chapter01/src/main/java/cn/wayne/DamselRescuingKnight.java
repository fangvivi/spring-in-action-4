package cn.wayne;

/**
 * @author wayne
 */
public class DamselRescuingKnight implements Knight{
    private RescueDamselQuest quest;
    /**
     * DamselRescuingKnight 与 RescueDamselQuest耦合在一起，
     * 骑士不能灵活地执行其他的任务
     */
    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}
