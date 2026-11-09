package org.example;

public class Table extends Furniture {
    private int legs;

    public Table(String name, int id, String material, int legs) {
        super(name, id, material);
        this.legs = legs;
    }

    @Override
    public String toString() {
        return super.toString() + " | Ножек: " + legs;
    }
}