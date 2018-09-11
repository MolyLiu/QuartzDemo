package com.lyk.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstQuartzTest {

    private int num=1;

    public void  test(){
        System.out.println("now time is:"+
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println(num);
        num++;
    }
}
