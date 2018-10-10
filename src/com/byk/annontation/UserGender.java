package com.byk.annontation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Author: ykbian
 * @Date: 2018/10/10 9:09
 * @Todo:  用户性别
 */


@Target(FIELD)   //意思是这个注释可以用在成员变量，对象，属性（包括enum实例）
@Retention(RUNTIME) //始终不会丢弃，运行期也保留该注解，因此可以使用反射机制读取该注解的信息。我们自定义的注解通常使用这种方式。
@Documented
public @interface UserGender {



    /**
     *  性别枚举
     */
    public enum Gender{ MAN,WOMEN};

    /**
     *  性别属性====如果不输入的话默认为 MAN
     */
    Gender userGender() default Gender.MAN;


}
