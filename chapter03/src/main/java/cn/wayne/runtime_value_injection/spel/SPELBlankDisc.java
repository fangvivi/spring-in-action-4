package cn.wayne.runtime_value_injection.spel;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
@Getter
@PropertySource(value = "classpath:app.properties")
public class SPELBlankDisc {
    @Value("#{configProperties['disc.title']}")
    private String title;
    @Value("#{configProperties['disc.artist']}")
    private String artist;
}
