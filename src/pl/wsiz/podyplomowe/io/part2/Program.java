package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Company company = new Company(new ConsoleLogger());

        company.addEmployee(new Developer("Jan", "Kowalski", 32, Sex.MALE, 3000, new String[]{"Java", "CSS"}));
        company.addEmployee(new Manager("Anna", "Nowak", 30, Sex.FEMALE, 5000, new String[]{"SCRUM"}, 4));
        company.addEmployee(new Developer("Katarzyna", "Janda", 21, Sex.FEMALE, 4000, new String[]{"CSS"}));

        int operation;
        boolean isWorking = true;

        while (isWorking) {
            System.out.println("Lista operacji:\n");
            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj programistę");
            System.out.println("3 - dodaj kierownika");
            System.out.println("4 - usuń pracownika");
            System.out.println("9 - zakończ program\n");

            System.out.print("Podaj numer operacji: ");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    company.printEmployees();
                    break;

                case 2:
//                    company.addDeveloper();
                    company.addEmployee(Developer.read());

                    break;

                case 3:
//                    company.addManager();
                    company.addEmployee(Manager.read());

                    break;

                case 4:
                    System.out.print("Podaj numer pracownika do usunięcia: ");
                    int employeeIndex = scanner.nextInt();
                    company.removeEmployee(employeeIndex);
                    break;

                case 9:
                    isWorking = false;
                    break;

                default:
                    System.out.println("Operacja o podanym numerze nie istnieje!");
            }
        }
    }
}
