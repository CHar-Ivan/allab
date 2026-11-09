package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<EducationalInstitution> institutions = new ArrayList<>();
        institutions.add(new School("Школа №1", "ул. Ленина, 10", 850, 11));
        institutions.add(new School("Гимназия №5", "пр. Мира, 25", 1200, 12));
        institutions.add(new School("Лицей №7", "ул. Пушкина, 3", 640, 9));
        institutions.add(new University("МГУ", "Ленинские горы, 1", 40000, 40));
        institutions.add(new University("СПбГУ", "Университетская наб., 7", 30000, 25));
        System.out.println("------ ТРЕБОВАНИЯ К ПОСТУПЛЕНИЮ ------\n");
        for (EducationalInstitution inst : institutions) {
            inst.displayInfo();
        }
        System.out.println("------ КРАТКИЙ СПИСОК ТРЕБОВАНИЙ ------\n");
        for (EducationalInstitution inst : institutions) {
            System.out.printf("%-15s (%s): %s%n",
                    inst.getName(),
                    inst.getType(),
                    inst.getAdmissionRequirements());
        }
    }
}