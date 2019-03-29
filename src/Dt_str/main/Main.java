package Dt_str.main;

import Dt_str.MyQueue;

import java.util.Random;

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

        call1911();


    }

    public static void call1911(){
        Random random = new Random();
        MyQueue<String> allCalls = new MyQueue<>(100);
        for (int i = 0; i < 10; i++) {
            int mobNr = 20000000 + random.nextInt(9999999 - 1111111) + 1111111;
            allCalls.enqueue(mobNr + "");
            System.out.println(mobNr + " is in waiting list");
        }
        while (!allCalls.isEmpty()){
            try {
                String mobActive = allCalls.dequeue();
                System.out.println(mobActive + " is served and its out!");

                Thread.sleep(random.nextInt(1000));

                if(random.nextInt(3) == 2){
                    int mobNr = 20000000 + random.nextInt(9999999 - 1111111) + 1111111;
                    allCalls.enqueue(mobNr + "");
                    System.out.println(mobNr + " is in waiting list");
                }
            }catch (Exception e){
                e.printStackTrace();
            }


        }
    }


}
