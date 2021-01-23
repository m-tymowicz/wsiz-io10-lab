package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Employee {
    String firstname;
    String lastname;
    int age;

    void print() {
        System.out.printf("%s %s %d\n", firstname, lastname, age);
    }

    static Employee read() {
        Employee employee = new Employee();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        employee.firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        employee.lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        employee.age = scanner.nextInt();

        return employee;
    }
}
