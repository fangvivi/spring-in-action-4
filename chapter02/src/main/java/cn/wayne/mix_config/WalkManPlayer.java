package cn.wayne.mix_config;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wayne
 */
public class WalkManPlayer implements MediaPlayer{
    private CompactDisc cd;

    @Autowired
    public WalkManPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
