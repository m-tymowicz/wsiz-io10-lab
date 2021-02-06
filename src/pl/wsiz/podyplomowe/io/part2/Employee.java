package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final Sex sex;

    Employee(String firstname, String lastname, int age, Sex sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    void print() {
        char sexChar = sex == Sex.FEMALE ? 'K' : 'M';

        System.out.printf("%s %s %d %c\n", firstname, lastname, age, sexChar);
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

        return new Employee(firstname, lastname, age, sex);
    }
}
