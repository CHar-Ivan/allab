package org.example;

public class Chair extends Furniture {
    private String backrest;

    public Chair(String name, int id, String material, String backrest) {
        super(name, id, material);
        this.backrest = backrest;
    }

    @Override
    public String toString() {
        return super.toString() + " | Спинка: " + backrest;
    }
}