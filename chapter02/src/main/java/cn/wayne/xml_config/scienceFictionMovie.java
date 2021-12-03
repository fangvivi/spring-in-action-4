package cn.wayne.xml_config;

import java.util.List;

/**
 * 演示xml实现构造器注入，并注装配集合
 * @author wayne
 */
public class scienceFictionMovie implements Movie {
    private String title;
    private String artist;
    private List<String> roles;

    public scienceFictionMovie(String title, String artist, List<String> roles) {
        this.title = title;
        this.artist = artist;
        this.roles = roles;
    }

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
        for (String role : roles){
            System.out.println("Role: " + role);
        }
    }
}
