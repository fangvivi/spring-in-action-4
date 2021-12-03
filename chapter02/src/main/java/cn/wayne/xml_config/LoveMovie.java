package cn.wayne.xml_config;

import java.util.List;

/**
 * 演示xml把字面量注入属性中
 * @author wayne
 */
public class LoveMovie implements Movie {
    private String title;
    private String artist;
    private List<String> roles;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setRoles(List<String> roles) {
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
