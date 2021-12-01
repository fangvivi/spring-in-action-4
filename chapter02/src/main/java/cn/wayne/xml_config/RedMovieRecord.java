package cn.wayne.xml_config;

import java.util.List;

/**
 * 演示xml把字面量注入属性中
 * @author wayne
 */
public class RedMovieRecord implements MovieRecord{
    private String title;
    private String artist;
    private List<String> scenes;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setScenes(List<String> scenes) {
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
