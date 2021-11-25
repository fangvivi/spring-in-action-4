package cn.wayne;

import java.io.PrintStream;

/**
 * @author wayne
 */
public class SlayDragonQuest implements Quest{
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }


    @Override
    public void embark() {
        printStream.println("恶龙受死吧!");
    }
}
