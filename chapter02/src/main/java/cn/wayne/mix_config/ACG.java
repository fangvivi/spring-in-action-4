package cn.wayne.mix_config;

/**
 * acg歌曲
 * @author wayne
 */
public class ACG implements CompactDisc{
    private String title = "炎";
    private String artist = "LiSA";
    @Override
    public void play() {
        System.out.println("sing " + title +" by " + artist);
    }
}
