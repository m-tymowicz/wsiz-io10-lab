package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;

    Employee(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    void print() {
        System.out.printf("%s %s %d\n", firstname, lastname, age);
    }

    static Employee read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        String firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        String lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        int age = scanner.nextInt();

        return new Employee(firstname, lastname, age);
    }
}
