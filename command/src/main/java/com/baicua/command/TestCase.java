package com.baicua.command;

/**
 * Created by 75631 on 2018/12/31.
 */
public class TestCase {
    public static void main(String[] args) {
        Payment payment=null;
        payment=new Payment(new AlipayCommand());
        payment.pay();
        payment=new Payment(new WexinpayCommand());
        payment.pay();
    }
}
