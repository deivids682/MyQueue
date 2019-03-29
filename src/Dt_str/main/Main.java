package Dt_str.main;

import Dt_str.MyQueue;

public class Main {

    public static void main(String[] args) {

        MyQueue qForInt = new MyQueue<>(6);

        qForInt.enqueue(5);
        qForInt.enqueue(10);
        System.out.println(qForInt);

        try {
            System.out.println(qForInt.dequeue());
        }catch (Exception e){
            e.printStackTrace();
        }

        qForInt.enqueue(1000);
        System.out.println(qForInt);


    }


}
