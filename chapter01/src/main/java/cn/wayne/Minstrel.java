package cn.wayne;

import java.io.PrintStream;

/**
 * @author wayne
 */
public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public Minstrel() {
    }

    public void singBeforeQuest(){
        printStream.println("怪物：听说你很勇哦？");
    }

    public void singAfterQuest(){
        printStream.println("骑士：我超勇的，好不好");
    }
}
