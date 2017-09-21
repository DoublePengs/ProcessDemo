package com.wiwide.processdemo;

/**
 * Created by Guolipeng on 2017/9/21.
 * 用来验证静态成员变量在多进程中修改失效
 */

public class UserManager {
    public static int sUserId =1;
}
