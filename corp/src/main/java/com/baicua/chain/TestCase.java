package com.baicua.chain;

/**
 * Created by 75631 on 2018/12/31.
 */
public class TestCase {
    public static void main(String[] args) {
        Handler handler=chains();
        handler.handle(1);
        handler.handle(15);
        handler.handle(17);
        handler.handle(99);
    }
    public static Handler chains(){
        Handler handler = new PupilHandler();
        handler.setNext(new JuniorHandler()).setNext(new SeniorHandler()).setNext(new CollegeHandler())
                .setNext(new GraduateHandler());
        return handler;
    }
}
