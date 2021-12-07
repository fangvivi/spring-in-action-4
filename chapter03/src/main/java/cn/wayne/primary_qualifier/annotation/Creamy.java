package cn.wayne.primary_qualifier.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用来替代@Qualifier，解决无法使用多个相同类型注解的问题
 * @author wayne
 */
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD,
ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Creamy {
}
