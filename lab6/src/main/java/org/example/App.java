package org.example;


public class App 
{
    public static void main(String[] args) {
        Counter counter = new Counter();


        for (int i = 0; i < 5; i++) {
            counter.increment();
        }


        for (int i = 0; i < 2; i++) {
            counter.decrement();
        }


        System.out.println("Итоговое значение счетчика: " + counter.getValue());
    }

}
