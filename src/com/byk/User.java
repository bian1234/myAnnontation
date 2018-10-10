package com.byk;

import com.byk.annontation.UserGender;
import com.byk.annontation.UserName;
import com.byk.annontation.UserSchool;


/**
 * @Author: ykbian
 * @Date: 2018/10/10 9:36
 * @Todo:  用户实体类
 */

public class User {

    /**
     *  注入字符串
     */
    @UserName("江德华")
    public String userName;

    /**
     *  枚举类型选择
     */
    @UserGender(userGender= UserGender.Gender.WOMEN)
    public String userGender;

    /**
     *  多条信息注入
     */
    @UserSchool(id = 10086,grade = "三年级一班",address = "北京市海淀区中关村北大街清华大学附属中学  邮编：100084")
    public String userSchool;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public void displayName(){
     System.out.println("学生姓名：刘德华");
    }

    public static  void main(String[] arg){
        UserInfoUtil.getUserInfo(User.class);
    }

}
