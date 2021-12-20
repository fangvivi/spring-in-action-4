package runtime_value_injection;


import cn.wayne.runtime_value_injection.ExpressiveConfigWithRequiredProperties;
import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 测试使用getRequiredProperty()获取的属性值不存在报异常的情况
 */
public class ExpressiveConfigWithRequiredPropertiesTest {

    @Test(expected= BeanCreationException.class)
    public void disc(){
        new AnnotationConfigApplicationContext(ExpressiveConfigWithRequiredProperties.class);
    }

}