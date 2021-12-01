package cn.wayne.xml_config;

import java.util.List;

/**
 * 演示xml实现构造器注入，并注装配集合
 * @author wayne
 */
public class BlackMovieRecord implements MovieRecord{
    private String title;
    private String artist;
    private List<String> scenes;

    public BlackMovieRecord(String title, String artist, List<String> scenes) {
        this.title = title;
        this.artist = artist;
        this.scenes = scenes;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String scene : scenes){
            System.out.println("Scene: " + scene);
        }
    }
}
