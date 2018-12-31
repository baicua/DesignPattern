package com.baicua.command;

/**
 * Created by 75631 on 2018/12/31.
 */
public class Payment {
    private Command command;
    public Payment(Command command){
        super();
        this.command=command;
    }

    void pay(){
        command.execute();
    }
}
