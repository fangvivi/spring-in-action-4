package cn.wayne.xml_config;

/**
 * 演示使用xml实现构造器注入，把字面量注入到构造器中
 * @author wayne
 */
public class WarMovie implements Movie {
    private String title;
    private String artist;

    public WarMovie(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public WarMovie(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
    }
}
