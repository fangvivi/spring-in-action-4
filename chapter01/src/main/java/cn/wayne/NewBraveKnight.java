package cn.wayne;

/**
 * @author wayne
 */
public class NewBraveKnight implements Knight{

    private Quest newQuest;

    public NewBraveKnight(Quest quest) {
        this.newQuest = quest;
    }

    @Override
    public void embarkOnQuest() {
        newQuest.embark();
    }
}
