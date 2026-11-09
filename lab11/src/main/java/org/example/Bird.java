package org.example;

public class Bird {
    private String name;
    private String species;
    private double wingspan;

    public Bird(String name, String species, double wingspan) {
        this.name = name;
        this.species = species;
        this.wingspan = wingspan;
    }
    public void fly() {
        System.out.println(name + " просто летит.");
    }

    public void fly(int distance) {
        System.out.println(name + " летит " + distance + " км.");
    }

    public void fly(double height) {
        System.out.println(name + " летит на высоте " + height + " метров.");
    }


    public String getFlightStyle() {
        return "Обычный полет";
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public double getWingspan() { return wingspan; }
}