package org.example;

public class Furniture {
    private String name;
    private int id;
    private String material;

    public Furniture(String name, int id, String material) {
        this.name = name;
        this.id = id;
        this.material = material;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format("ID: %d | Название: %s | Материал: %s", id, name, material);
    }
}