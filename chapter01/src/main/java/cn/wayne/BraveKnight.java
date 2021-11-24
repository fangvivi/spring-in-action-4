package cn.wayne;

/**
 * @author wayne
 */
public class BraveKnight implements Knight{
    private Quest quest;

    /**
     * 构造器注入
     * 骑士现在可以接受与Quest形式的各种任务了
     * @param quest 任务被注入进来
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
