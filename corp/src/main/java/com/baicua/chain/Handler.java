package com.baicua.chain;

/**
 * Created by 75631 on 2018/12/31.
 */
public abstract class Handler {
    public Handler next;
    public Handler setNext(Handler handler){
        this.next=handler;
        return next;
    }
    public abstract void handle(int age);
}
