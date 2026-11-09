package org.example;

public class Sparrow extends Bird {
    // Дополнительное поле
    private boolean isMigratory;

    public Sparrow(String name, String species, double wingspan, boolean isMigratory) {
        super(name, species, wingspan);
        this.isMigratory = isMigratory;
    }

    // Переопределение метода родителя
    @Override
    public String getFlightStyle() {
        return "Порхающий полет";
    }

    // Собственный перегруженный метод
    public void chirp() {
        System.out.println(getName() + " чирикает: чик-чирик!");
    }

    public void chirp(int times) {
        System.out.print(getName() + " чирикает: ");
        for (int i = 0; i < times; i++) {
            System.out.print("чик-чирик! ");
        }
        System.out.println();
    }
}