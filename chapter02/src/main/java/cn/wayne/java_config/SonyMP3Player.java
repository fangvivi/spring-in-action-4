package cn.wayne.java_config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 *
 */

public class SonyMP3Player implements MP3Player {
    private SongRecord cd;


    /**
     * required = false，当spring自动装配找不到合适的类时，不会抛出异常
     * 但是这个类可能会因为未装配而出现空指针异常
     * @param cd
     */
    @Autowired
    public SonyMP3Player(SongRecord cd) {
        this.cd = cd;
    }


    @Override
    public void play() {

    }

}
