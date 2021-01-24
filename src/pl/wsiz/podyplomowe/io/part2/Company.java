package pl.wsiz.podyplomowe.io.part2;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();

    void add(Employee employee) {
        employees.add(employee);
    }

    void printEmployees() {
        System.out.println("------------------");

        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%d  ", i + 1);

            Employee employee = employees.get(i);
            employee.print();
        }

        System.out.println("------------------");
    }
}
