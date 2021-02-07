package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final Sex sex;
    private final int salary;
    private final String[] skills;

    Employee(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    void print() {
        char sexChar = sex == Sex.FEMALE ? 'K' : 'M';
        String skillsStr = String.join(", ", skills);

        System.out.printf("%s %s %d %c %dzł [%s]\n", firstname, lastname, age, sexChar, salary, skillsStr);
    }

    boolean isEqual(Employee employee) {
        return firstname.equals(employee.firstname) && lastname.equals(employee.lastname) && age == employee.age;
    }

    static Employee read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        String firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        String lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        int age = scanner.nextInt();

        System.out.print("Podaj płeć:      ");
        char sexChar = scanner.next().toUpperCase().charAt(0);
        Sex sex = sexChar == 'K' ? Sex.FEMALE : Sex.MALE;

        System.out.print("Podaj zarobki:   ");
        int salary = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Podaj umiejętności: ");
        String[] skills = scanner.nextLine().split(",");
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skills[i].trim();
        }

        return new Employee(firstname, lastname, age, sex, salary, skills);
    }
}
