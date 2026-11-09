package org.example;

public class Eagle extends Bird {

    private double maxAltitude;

    public Eagle(String name, String species, double wingspan, double maxAltitude) {
        super(name, species, wingspan);
        this.maxAltitude = maxAltitude;
    }


    @Override
    public String getFlightStyle() {
        return "Парящий полет";
    }


    public void hunt() {
        System.out.println(getName() + " высматривает добычу с высоты.");
    }

    public void hunt(String prey) {
        System.out.println(getName() + " камнем падает вниз и атакует: " + prey);
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }
}