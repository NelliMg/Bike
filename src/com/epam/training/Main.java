package com.epam.training;

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();

        for (int i = 0; i < 10; i++) {
            bike.accelerate();
        }
        for (int i = 0; i < 5; i++) {
            bike.pressBreak();
        }
        for (int i = 0; i < 5; i++) {
            bike.accelerate();
        }
        bike.stop();
    }
}
