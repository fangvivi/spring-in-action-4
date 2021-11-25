package cn.wayne;

/**
 * @author wayne
 */
public class BraveKnight implements Knight{
    private Quest quest;
    private Minstrel minstrel;

    /**
     * 构造器注入
     * 骑士现在可以接受与Quest形式的各种任务了
     * @param quest 任务被注入进来
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    @Override
    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
