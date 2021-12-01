package cn.wayne.xml_config;

public class OrangeMP4Player implements MP4Player{
    private MovieRecord movieRecord;

    public void setMovieRecord(MovieRecord movieRecord) {
        this.movieRecord = movieRecord;
    }

    @Override
    public void play() {

    }
}
