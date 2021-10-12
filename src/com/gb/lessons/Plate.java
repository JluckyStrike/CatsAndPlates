package com.gb.lessons;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        this.food -= n;
    }

    public void increaseFood(int n) {
        this.food += n;
    }

    public int getFood() {
        return food;
    }
}
