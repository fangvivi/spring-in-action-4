package cn.wayne.runtime_value_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * 注解@Value也可以直接写在类的成员变量上，不需要构造方法也可以实现注入
 */
@Component
public class Student {

    @Value("${name}")
    private String name;
    @Value("${title}")
    private String title;

    public Student(
            @Value("${name}") String name,
            @Value("${title}") String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }



}
