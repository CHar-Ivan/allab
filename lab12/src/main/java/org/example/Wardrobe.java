package org.example;

public class Wardrobe extends Furniture {
    private int doors;

    public Wardrobe(String name, int id, String material, int doors) {
        super(name, id, material);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return super.toString() + " | Дверей: " + doors;
    }
}