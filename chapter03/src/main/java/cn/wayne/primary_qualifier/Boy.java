package cn.wayne.primary_qualifier;

import cn.wayne.primary_qualifier.annotation.Cold;
import cn.wayne.primary_qualifier.annotation.Creamy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author wayne
 * DessertConfig中的cookies()和iceCream()都使用了@Primary注解，
 * 这个时候需要使用 @Qualifier来限定选择的bean。
 * iceCream为bean的默认限定名，和bean的id一样
 * 当然，也可以用@Qualifier注解为bean指定限定名，这里iceCream的限定名被指定为“cold”。
 * 如果使用多个限定名来确定唯一的bean，使用自定义注解可以解决@Qualifier注解无法被重复实用的问题
 */
public class Boy {
    @Autowired
    @Cold
    @Creamy
    private Dessert dessert;


    public void eat(){
        dessert.name();
    }
}
