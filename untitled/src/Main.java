import java.util.Scanner;
import java.util.regex.*;

class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    static void generateReport(Employee[] employees) {
        System.out.printf("%-15s | %10s%n","фамилия","зп");
        for (Employee e : employees) {

            System.out.printf("%-15s | %10.2f%n", e.fullname, e.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите задание:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                int number = 123;
                String str = String.valueOf(number);
                System.out.println(str);
                System.out.println(str.length());
                break;
            }
            case 2: {
                //String text = "Привет, мир!";
                sc.nextLine();
                String text=sc.nextLine();
                String result = text.replaceAll("(?i)[аеёиоуыэюяaeiou]", "");
                System.out.println(result);
                break;
            }
            case 3: {
                Employee[] employees = {
                        new Employee("Иванов И.И.", 50000),
                        new Employee("Петров П.П.", 72500.5),
                        new Employee("Сидоров С.С.", 48900.756)
                };
                Report.generateReport(employees);
                break;
            }
            case 4: {
                String text = "a!a a@a a#a a$a a%a a^a";
                Matcher m = Pattern.compile("a[^a-zA-Z\\s]a").matcher(text);
                while (m.find()) {
                    System.out.println(m.group());
                }
                break;
            }

            default:
                System.out.println("Неверный выбор");
        }

        sc.close();
    }
}