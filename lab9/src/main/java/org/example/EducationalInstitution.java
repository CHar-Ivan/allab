package org.example;

public abstract class EducationalInstitution {
    protected String name;
    protected String address;
    protected int students;

    public EducationalInstitution(String name, String address, int students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }


    public abstract String getType();
    public abstract String getAdmissionRequirements();


    public void displayInfo() {
        System.out.println("=== " + getType() + " ===");
        System.out.println("Название: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Количество студентов: " + students);
        System.out.println("Требования к поступлению: " + getAdmissionRequirements());
        System.out.println();
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getStudents() { return students; }
}