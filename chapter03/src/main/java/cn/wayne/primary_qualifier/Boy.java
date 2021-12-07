package cn.wayne.primary_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author wayne
 * DessertConfig中的cookies()和iceCream()都使用了@Primary注解，
 * 这个时候需要使用 @Qualifier来限定选择的bean，
 * iceCream为bean的默认限定名，和bean的id一样
 * 当然，也可以用@Qualifier注解为bean指定限定名，
 * 这里iceCream的限定名被指定为“cold”
 */
public class Boy {
    @Autowired
    @Qualifier("cold")
    private Dessert dessert;


    public void eat(){
        dessert.name();
    }
}
