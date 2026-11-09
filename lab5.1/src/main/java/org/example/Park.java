package org.example;

public class Park {

    private String name;
    private double area;
    private int trees;

    public Park(String name, double area, int trees) {
        this.name = name;
        this.area = area;
        this.trees = trees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getTrees() {
        return trees;
    }

    public void setTrees(int trees) {
        this.trees = trees;
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", trees=" + trees +
                '}';
    }
}