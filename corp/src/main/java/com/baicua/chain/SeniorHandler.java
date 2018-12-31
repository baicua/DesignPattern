package com.baicua.chain;

/**
 * Created by 75631 on 2018/12/31.
 */
public class SeniorHandler extends Handler{
    public void handle(int age) {
        if (age<=18){
            System.out.println("我是高学生");
        }else if (null!=this.next){
            this.next.handle(age);
        }
    }
}
