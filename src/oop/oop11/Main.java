package oop.oop11;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0 ;  i < 5 ; i++) {
            arr.add(i+1);
        }

//        arr.forEach((item)->{
//            System.out.print(item  * 2 + " ");
//        });

        Consumer<Integer> fun = (item)-> System.out.print(item  * 2 + " ");

        arr.forEach(fun);



    }

    int sum (int a, int b) {
        return a + b;
    }
}
