package com.gb.lessons;

public class Main {

    public static void main(String[] args) {
        Cat[] cat =  {new Cat("Barsik", 70), new Cat("Tom", 20), new Cat("Murzik", 50)};
        Plate plate = new Plate(100);

        plate.info();
        plate.increaseFood(40);
        
        for (Cat c: cat) {
            c.eat(plate);
            System.out.println(c);
            plate.info();
        }
    }
}
