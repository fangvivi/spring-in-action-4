package cn.wayne.xml_config;

/**
 * 演示xml实现构造器注入bean引用
 * @author wayne
 */
public class AppleMP4Player implements MP4Player{
    private GoodMovieRecord mp4;

    public AppleMP4Player(GoodMovieRecord mp4) {
        this.mp4 = mp4;
    }

    @Override
    public void play() {

    }
}
