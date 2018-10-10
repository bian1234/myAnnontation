package com.byk;
import com.byk.annontation.UserGender;
import com.byk.annontation.UserName;
import com.byk.annontation.UserSchool;

import java.lang.reflect.Field;
/**
 * @Author: ykbian
 * @Date: 2018/10/10 9:27
 * @Todo:   注解处理器
 */

public class UserInfoUtil {

    public static void getUserInfo(Class<?> clazz){

        String userNameString=" 学生姓名：";
        String userGenderString=" 学生性别：";
        String userSchoolString=" 学校信息：";

        Field[] fields = clazz.getDeclaredFields();

        for(Field field :fields){
            if(field.isAnnotationPresent(UserName.class)){
                UserName userName = field.getAnnotation(UserName.class);
                userNameString=userNameString+userName.value();
                System.out.println(userNameString);
            }
            else if(field.isAnnotationPresent(UserGender.class)){
                UserGender userGender= field.getAnnotation(UserGender.class);
                userGenderString=userGenderString+userGender.userGender();
                System.out.println(userGenderString);
            }
            else if(field.isAnnotationPresent(UserSchool.class)){
                UserSchool school= field.getAnnotation(UserSchool.class);
                userSchoolString=userSchoolString+" 学号："+school.id()+" 班级："+school.grade()+" 学校地址："+school.address();
                System.out.println(userSchoolString);
            }
        }
    }
}
