package cn.wayne.runtime_value_injection.spel;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
@Getter
public class SPELBlankDisc {
    @Value("#{systemEnvironment['disc.title']}")
    private String title;
    @Value("#{systemEnvironment['disc.artist']}")
    private String artist;
}
