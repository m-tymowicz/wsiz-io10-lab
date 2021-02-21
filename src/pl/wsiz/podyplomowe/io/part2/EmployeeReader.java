package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

enum EmployeeType {
    DEVELOPER,
    MANAGER
}

public class EmployeeReader {

    static Employee read(EmployeeType type) {
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

        if (type == EmployeeType.DEVELOPER) {
            return new Developer(firstname, lastname, age, sex, salary, skills);

        } else {

            System.out.print("Podaj rozm. zespołu:");
            int teamSize = scanner.nextInt();

            return new Manager(firstname, lastname, age, sex, salary, skills, teamSize);
        }
    }
}
