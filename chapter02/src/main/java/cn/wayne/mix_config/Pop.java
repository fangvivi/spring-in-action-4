package cn.wayne.mix_config;

import java.util.List;

/**
 * 流行歌曲
 * @author wayne
 */
public class Pop implements CompactDisc{

    private String title;
    private String artist;
    private List<String> lyrics;

    public Pop(String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    @Override
    public void play() {
        System.out.println("sing " + title +" by " + artist);
        for (String lyric : lyrics) {
            System.out.println("-lyric: " + lyric);
        }
    }
}
