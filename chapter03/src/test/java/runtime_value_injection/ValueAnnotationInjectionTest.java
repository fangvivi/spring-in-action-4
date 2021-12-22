package runtime_value_injection;

import cn.wayne.runtime_value_injection.ExpressiveConfig;
import cn.wayne.runtime_value_injection.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * 测试使用@Value注解在运行时为bean注入属性
 */
public class ValueAnnotationInjectionTest {

    @Test
    public void javaConfigStudentTest(){
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(ExpressiveConfig.class);
        Student student = ctx.getBean("student", Student.class);
        assertNotNull(student);
        assertEquals("Zhangsan",student.getName());
    }

}
