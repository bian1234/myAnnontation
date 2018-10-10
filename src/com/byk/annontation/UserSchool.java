package com.byk.annontation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Author: ykbian
 * @Date: 2018/10/10 9:23
 * @Todo:  用户学籍信息注解
 */
@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface UserSchool {

    /**
     *  学号
     */
     public int id() default -1;


     /**
      *  班级信息
      */
     public String grade() default "";

     /**
      *   学校地址
      */
     public String address() default "";
}
