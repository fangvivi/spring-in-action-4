package cn.wayne.xml_config;

/**
 * 演示xml属性注入，bean注入属性使用setter方法
 * @author wayne
 */
public class WarMoviePlayer implements MP4Player{
    private Movie movie;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void play() {
        movie.play();
    }
}
