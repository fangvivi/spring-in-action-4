package runtime_value_injection;

import cn.wayne.runtime_value_injection.Boy;
import cn.wayne.runtime_value_injection.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * 测试使用xml在运行时为bean注入属性
 */
public class ValueXmlInjectionTest {

    @Test
    public void xmlConfigStudentTest(){
        ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:student.xml");
        Student student = ctx.getBean("boy", Boy.class);
        assertNotNull(student);
        assertEquals("Zhangsan",student.getName());
    }
}
