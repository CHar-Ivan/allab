package org.example;

public class School extends EducationalInstitution {
    private int grades;

    public School(String name, String address, int students, int grades) {
        super(name, address, students);
        this.grades = grades;
    }

    @Override
    public String getType() {
        return "Школа";
    }

    @Override
    public String getAdmissionRequirements() {
        return "Требуется справка о прививках";
    }

    public int getGrades() { return grades; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество классов: " + grades);
        System.out.println();
    }
}