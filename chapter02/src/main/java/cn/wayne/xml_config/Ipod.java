package cn.wayne.xml_config;

/**
 * 演示xml实现构造器注入bean引用
 * @author wayne
 */
public class Ipod implements MP4Player{
    private Movie movie;

    public Ipod(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void play() {
        movie.play();
    }
}
