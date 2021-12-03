package cn.wayne.java_config;

/**
 * @author wayne
 *
 */

public class GoodSongRecord implements SongRecord {

    private String title = "茉莉花";
    private String artist = "中国民间音乐艺术家";

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
    }
}
