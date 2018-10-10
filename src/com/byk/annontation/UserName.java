package com.byk.annontation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Author: ykbian
 * @Date: 2018/10/10 9:06
 * @Todo:  用户名注解
 */

@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface UserName {

    String value() default "";
}
