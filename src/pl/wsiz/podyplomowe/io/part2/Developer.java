package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Developer extends Employee {

    Developer(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    static Developer read() {
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

        return new Developer(firstname, lastname, age, sex, salary, skills);
    }
}
