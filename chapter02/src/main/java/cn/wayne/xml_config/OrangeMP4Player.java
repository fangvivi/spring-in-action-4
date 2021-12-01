package cn.wayne.xml_config;

/**
 * 演示xml属性注入，bean注入属性使用setter方法
 * @author wayne
 */
public class OrangeMP4Player implements MP4Player{
    private MovieRecord movieRecord;

    public void setMovieRecord(MovieRecord movieRecord) {
        this.movieRecord = movieRecord;
    }

    @Override
    public void play() {

    }
}
