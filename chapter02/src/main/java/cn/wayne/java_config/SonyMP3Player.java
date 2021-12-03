package cn.wayne.java_config;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wayne
 *
 */

public class SonyMP3Player implements MP3Player {
    private SongRecord cd;


    /**
     * @param cd
     */
    @Autowired
    public SonyMP3Player(SongRecord cd) {
        this.cd = cd;
    }


    @Override
    public void play() {
        cd.play();
    }

}
