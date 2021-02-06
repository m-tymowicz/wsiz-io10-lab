package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Company company = new Company();

        Employee employee1 = new Employee("Jan", "Kowalski", 32);
        Employee employee2 = new Employee("Anna", "Nowak", 30);
        Employee employee3 = new Employee("Katarzyna", "Janda", 21);

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        int operation;
        do {
            System.out.println("Lista operacji:\n");

            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj pracownika");
            System.out.println("3 - usuń pracownika");
            System.out.println("9 - zakończ program\n");

            System.out.print("Podaj numer operacji: ");
            operation = scanner.nextInt();

            if (operation == 1) {
                company.printEmployees();

            } else if (operation == 2) {
                company.addEmployee();

            } else if (operation == 3) {
                System.out.print("Podaj numer pracownika do usunięcia: ");
                int employeeIndex = scanner.nextInt();
                company.removeEmployee(employeeIndex);

            } else if (operation != 9) {
                System.out.println("Operacja o podanym numerze nie istnieje!");
            }

        } while (operation != 9);

    }
}
