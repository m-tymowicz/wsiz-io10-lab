package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public class Manager extends Employee {
    private int teamSize;

    Manager(String firstname, String lastname, int age, Sex sex, int salary, String[] skills, int teamSize) {
        super(firstname, lastname, age, sex, salary, skills);
        this.teamSize = teamSize;
    }

    private Manager() {
        super();
    }

    static Manager read() {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        manager.readFields();

        System.out.print("Podaj rozm. zespołu:");
        manager.teamSize = scanner.nextInt();

        return manager;
    }

    @Override
    public String toString() {
        return String.format("K %s %d", super.toString(), teamSize);
    }

    @Override
    int getTotalSalary() {
        return getSalary() + (int) (getSalary() * 0.05 * (teamSize / 5));
    }
}
